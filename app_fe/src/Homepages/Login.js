import React, { useState, useEffect } from "react";
import { useNavigate } from "react-router-dom";
import axios from "axios";
import "./Login.css";

const Login = () => {
    const [email, setEmail] = useState("");
    const [password, setPassword] = useState("");
    const [error, setError] = useState("");
    const navigate = useNavigate();

    const handleLogin = (e) => {
        e.preventDefault();

        axios.get("http://localhost:5298/accounts")
            .then(response => {
                if (response.data && Array.isArray(response.data.accounts)) {
                    const user = response.data.accounts.find(
                        acc => acc.email === email && acc.password === password
                    );

                    if (user) {
                        alert("Login successful!");
                        navigate("/");
                    } else {
                        setError("Invalid email or password");
                    }
                } else {
                    setError("Error loading account data. Please try again later.");
                }
            })
            .catch(error => {
                console.error("Error loading accounts:", error);
                setError("Error connecting to server");
            });
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
