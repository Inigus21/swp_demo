import React, { useState } from "react";
import { useNavigate } from "react-router-dom";
import axios from "axios";
import "./Login.css";

const Login = () => {
    const [email, setEmail] = useState("");
    const [password, setPassword] = useState("");
    const [error, setError] = useState("");
    const navigate = useNavigate();

    const handleLogin = async (e) => {
        e.preventDefault();
        setError(""); // Xóa lỗi trước khi login

        try {
            const response = await axios.get("http://localhost:5298/accounts");

            if (Array.isArray(response.data)) {
                const user = response.data.find(
                    (acc) => acc.email === email && acc.password === password
                );

                if (user) {
                    alert("Login successful!");
                    navigate("/");
                } else {
                    setError("Invalid email or password");
                }
            } else {
                setError("Unexpected response format. Please try again later.");
            }
        } catch (error) {
            console.error("Error loading accounts:", error);
            setError("Error connecting to the server. Please try again later.");
        }
    };

    return (
        <div className="login-wrapper">
            <div className="login-container">
                <h2>Login</h2>
                <form onSubmit={handleLogin} className="login-form">
                    <input
                        type="email"
                        placeholder="Email"
                        value={email}
                        onChange={(e) => setEmail(e.target.value)}
                        required
                        className="login-input"
                    />
                    <input
                        type="password"
                        placeholder="Password"
                        value={password}
                        onChange={(e) => setPassword(e.target.value)}
                        required
                        className="login-input"
                    />
                    <button type="submit" className="login-button">Login</button>
                </form>
                {error && <p className="error-message">{error}</p>}
            </div>
        </div>
    );
};

export default Login;
