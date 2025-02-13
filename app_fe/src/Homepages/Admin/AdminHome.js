import React, { useState, useEffect } from "react";
import { useForm } from "react-hook-form";
import axios from "axios";
import { Table, Input, Button, Modal, Menu } from "antd";

const API_URL = "http://localhost:8080/api/tour";

const TourTable = () => {
    const [data, setData] = useState([]);
    const { register, handleSubmit, reset } = useForm();
    const [isModalOpen, setIsModalOpen] = useState(false);
    const [editingTour, setEditingTour] = useState(null);
    const [searchTerm, setSearchTerm] = useState("");

    useEffect(() => {
        fetchTours();
    }, []);

    const fetchTours = async () => {
        try {
            const response = await axios.get(API_URL);
            setData(response.data);
        } catch (error) {
            console.error("Error fetching tours:", error);
        }
    };

    const handleDelete = async (id) => {
        try {
            await axios.delete(`${API_URL}/${id}`);
            setData(data.filter((item) => item.id !== id));
        } catch (error) {
            console.error("Error deleting tour:", error);
        }
    };

    const columns = [
        { title: "Name", dataIndex: "name", key: "name" },
        { title: "Departure Location", dataIndex: "departureLocation", key: "departureLocation" },
        { title: "Price", dataIndex: "price", key: "price" },
        { title: "Max Capacity", dataIndex: "maxCapacity", key: "maxCapacity" },
        { title: "Created Time", dataIndex: "createdTime", key: "createdTime" },
        { title: "Deleted Time", dataIndex: "deletedTime", key: "deletedTime" },
        { title: "Is Deleted", dataIndex: "isDeleted", key: "isDeleted", render: (text) => (text ? "Yes" : "No") },
        {
            title: "Action",
            key: "action",
            render: (_, record) => (
                <Button onClick={() => console.log("Viewing details for", record.id)}>Details</Button>
            ),
        },
    ];

    return (
        <div className="p-5 bg-gray-100 min-h-screen">
            {/* Navigation Menu */}
            <Menu mode="horizontal" className="mb-4">
                <Menu.Item key="tours">Tours</Menu.Item>
                <Menu.Item key="account">Account</Menu.Item>
            </Menu>

            {/* Search Bar */}
            <Input.Search
                placeholder="Search tours..."
                className="w-1/3 mb-4"
                value={searchTerm}
                onChange={(e) => setSearchTerm(e.target.value)}
            />

            <Table
                columns={columns}
                dataSource={data.filter(tour => tour.name.toLowerCase().includes(searchTerm.toLowerCase()))}
                rowKey="id"
                pagination={{ pageSize: 5 }}
            />
        </div>
    );
};

export default TourTable;
