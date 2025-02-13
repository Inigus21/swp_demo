import React, { useState } from "react";
import axios from "axios";
import { FaUser, FaEnvelope, FaBirthdayCake, FaPhone, FaMapMarkerAlt } from "react-icons/fa";
import "./UserProfile.css"; // Đảm bảo có file CSS

const UserProfile = () => {
    const [formData, setFormData] = useState({
        fullName: "",
        email: "",
        birthday: "",
        phone: "",
        address: "",
    });

    const [message, setMessage] = useState("");

    const handleChange = (e) => {
        setFormData({ ...formData, [e.target.name]: e.target.value });
    };

    const handleUpdate = async (e) => {
        e.preventDefault();
        try {
            const response = await axios.put("http://127.0.0.1:5000/update", formData);
            setMessage(response.data.message);
        } catch (error) {
            setMessage("Update failed. Please try again.");
        }
    };

    return (
        <div className="profile-container">
            <h2><span className="brand">Tour</span>Nest</h2>
            {message && <p className="message">{message}</p>}
            <form onSubmit={handleUpdate}>
                <div className="input-group">
                    <FaUser className="icon" />
                    <input type="text" name="fullName" placeholder="Full name" value={formData.fullName} onChange={handleChange} required />
                </div>
                <div className="input-group">
                    <FaEnvelope className="icon" />
                    <input type="email" name="email" placeholder="Email address" value={formData.email} onChange={handleChange} required />
                </div>
                <div className="input-group">
                    <FaBirthdayCake className="icon" />
                    <input type="date" name="birthday" placeholder="Birthday" value={formData.birthday} onChange={handleChange} required />
                </div>
                <div className="input-group">
                    <FaPhone className="icon" />
                    <input type="tel" name="phone" placeholder="Phone" value={formData.phone} onChange={handleChange} required />
                </div>
                <div className="input-group">
                    <FaMapMarkerAlt className="icon" />
                    <input type="text" name="address" placeholder="Address" value={formData.address} onChange={handleChange} required />
                </div>
                <button type="submit" className="save-btn">Save information</button>
                <button type="button" className="change-btn">Change password</button>
            </form>
        </div>
    );
};

export default UserProfile;
