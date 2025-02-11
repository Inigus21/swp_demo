import React, { useState } from "react";
import axios from "axios";
import "./Signup.css"; // Import CSS

const Signup = () => {
    const [formData, setFormData] = useState({
        fullName: "",
        phone: "",
        email: "",
        password: "",
        confirmPassword: "",
        agreeTerms: false,
    });

    const handleChange = (e) => {
        const { name, value, type, checked } = e.target;
        setFormData({
            ...formData,
            [name]: type === "checkbox" ? checked : value,
        });
    };

    const handleSubmit = async (e) => {
        e.preventDefault();

        if (formData.password !== formData.confirmPassword) {
            alert("Passwords do not match!");
            return;
        }

        try {
            const response = await axios.post("http://localhost:5298/register", {
                fullName: formData.fullName,
                phone: formData.phone,
                email: formData.email,
                password: formData.password,
            });

            alert("Registration successful!");
            console.log(response.data);
        } catch (error) {
            console.error("Registration failed:", error);
            alert("Registration failed!");
        }
    };

    return (
        <div className="signup-container">
            <div className="signup-image">
                <h1>It's time to <span>TourNest</span></h1>
            </div>
            <div className="signup-form">
                <h2>Register</h2>
                <form onSubmit={handleSubmit}>
                    <div className="input-group">
                        <span>👤</span>
                        <input
                            type="text"
                            name="fullName"
                            placeholder="Full name"
                            value={formData.fullName}
                            onChange={handleChange}
                            required
                        />
                    </div>
                    <div className="input-group">
                        <span>📞</span>
                        <input
                            type="tel"
                            name="phone"
                            placeholder="Phone number"
                            value={formData.phone}
                            onChange={handleChange}
                            required
                        />
                    </div>
                    <div className="input-group">
                        <span>📧</span>
                        <input
                            type="email"
                            name="email"
                            placeholder="Email Address"
                            value={formData.email}
                            onChange={handleChange}
                            required
                        />
                    </div>
                    <div className="input-group">
                        <span>🔑</span>
                        <input
                            type="password"
                            name="password"
                            placeholder="Password"
                            value={formData.password}
                            onChange={handleChange}
                            required
                        />
                    </div>
                    <div className="input-group">
                        <span>🔑</span>
                        <input
                            type="password"
                            name="confirmPassword"
                            placeholder="Repeat your password"
                            value={formData.confirmPassword}
                            onChange={handleChange}
                            required
                        />
                    </div>
                    <div className="terms">
                        <input
                            type="checkbox"
                            name="agreeTerms"
                            checked={formData.agreeTerms}
                            onChange={handleChange}
                            required
                        />
                        <label>I agree all statements in <strong>Term of service</strong></label>
                    </div>
                    <button type="submit" className="register-btn">Register</button>
                    <p className="login-link">I am already a member</p>
                </form>
            </div>
        </div>
    );
};

export default Signup;
