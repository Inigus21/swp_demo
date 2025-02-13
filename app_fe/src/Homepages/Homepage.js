import React, { useState, useEffect } from "react";
import "./Homepage.css";
import axios from 'axios';
import { FaHotel, FaPlane, FaTree } from "react-icons/fa";
import halong from '../assets/halong.jpg'
import hue from '../assets/hue.jpg'
import cantho from '../assets/cantho.jpg'
import danang from '../assets/danang.jpg'
import chilinh from '../assets/chilinh.jpg'
import chihanh from '../assets/chihanh.jpg'
import anhmanh from '../assets/anhmanh.jpg'
import { Link } from "react-router-dom";
const HomePage = () => {
 
  const [tours, setTours] = useState([]); // Sửa lỗi thiếu khai báo state
  const [location, setLocation] = useState("");
  const [duration, setDuration] = useState("");
  const [price, setPrice] = useState("");
  const [filteredTours, setFilteredTours] = useState([]);

  useEffect(() => {
    axios.get("http://localhost:8080/tours?season=Spring") //  API section tour
      .then((response) => {
        setTours(response.data);
      })
      .catch((error) => {
        console.error("Error fetching tours:", error);
      });
  }, []);


  const durations = [
    "5 days 4 nights",
    "3 days 2 nights",
    "4 days 3 nights",
    "7 days 6 nights",
    "6 days 5 nights",
    "2 days 1 night"
  ];

  const priceOptions = [
    "under 300$",
    "from 300$ to 500$",
    "from 500$ to 800$",
    "greater 800"
  ];

  const handleSearch = async () => {
    try {
      const response = await axios.get("http://localhost:8080/tours", {
        params: { location, duration, price }
      });

      setFilteredTours(response.data); // Sửa lỗi response.data.results
    } catch (error) {
      console.error("Error fetching tours:", error);
    }
  };

  return (
    <div className="homepage">
      {/* Header */}
      <header className="top-header">
        <div className="contact">📞 1900 1839 - From 8:00 AM to 11:00 PM daily.</div>
        <div className="login">
          <Link to="/Login">Login</Link> / <Link to="/signup">Sign Up</Link>
        </div>
      </header>

      {/* Navbar */}
      <nav className="navbar">
        <div className="logo">Tour<span>Nest</span></div>
        <ul>
          <li>Home</li>
          <li>Destination</li>
          <li>Tour</li>
          <li>Clients Reviews</li>
          <li>Contact</li>
        </ul>
      </nav>

      {/* Hero Section */}
      <div className="hero">
        <div className="hero-text">
          {/* <h1>Enjoy Your <span>Traveling</span></h1>
          <button className="book-btn">BOOK NOW</button>
          <p className="site-link">TourNestsite.com</p> */}
        </div>
      </div>

      {/* Search Box */}
      <div className="search-box">
  <h2>Search Tours</h2>

  {/* Price, Location, Duration trên cùng một dòng */}
  <div className="filters">
    <select value={price} onChange={(e) => setPrice(e.target.value)}>
      <option value="">Select Price Range</option>
      {priceOptions.map((p, index) => (
        <option key={index} value={p}>{p}</option>
      ))}
    </select>

    <input
      type="text"
      placeholder="Enter Location"
      value={location}
      onChange={(e) => setLocation(e.target.value)}
    />

    <select value={duration} onChange={(e) => setDuration(e.target.value)}>
      <option value="">Select Duration</option>
      {durations.map((d, index) => (
        <option key={index} value={d}>{d}</option>
      ))}
    </select>
  </div>

  <button onClick={handleSearch}>Search</button>

  {/* Display Results */}
  <div className="search-results">
    {filteredTours.length > 0 ? (
      <ul>
        {filteredTours.map((tour) => (
          <li key={tour.id}>
            <h3>{tour.name}</h3>
            <p><strong>Location:</strong> {tour.destination}</p>
            <p><strong>Duration:</strong> {tour.duration}</p>
            <p><strong>Price:</strong> ${tour.price}</p>
          </li>
        ))}
      </ul>
    ) : (
      <p></p>
    )}
  </div>
</div>

      {/* Top Destination Section */}
      <div className="top-destination">
        <h2>Top Destination</h2>
        <p>The most popular destinations are based on reviews from magazines, articles, and customer experiences</p>

        <div className="destination-grid">
          <div className="destination-item">
            <img src={halong} alt="Hạ Long" />
            <span className="destination-name">Hạ Long</span>
          </div>
          <div className="destination-item">
            <img src={hue} alt="Huế" />
            <span className="destination-name">Huế</span>
          </div>
          <div className="destination-item">
            <img src={danang} alt="Đà Nẵng" />
            <span className="destination-name">Đà Nẵng</span>
          </div>
          <div className="destination-item">
            <img src={cantho} alt="Cần Thơ" />
            <span className="destination-name">Cần Thơ</span>
          </div>
        </div>
      </div>


      {/* Tour Section */}
      <div className="tour-section">
        <h2>Tour</h2>
        <p>The most searched and recommended tours</p>

        <div className="tour-grid">
          {tours.map((tour) => (
            <div key={tour.id} className="tour-card">
              <img src={tour.image} alt={tour.name} />
              <div className="tour-info">
                <h3 className="tour-title">{tour.name}</h3>
                <span className="tour-price">{tour.price}</span>
                <ul className="tour-details">
                  <li>{tour.duration}</li>
                  <li>5 star</li>
                  <li>Transportation</li>
                  <li>Food Facilities</li>
                </ul>
                <div className="tour-rating">
                  {"⭐".repeat(tour.rating)} <span>{tour.views} views</span>
                </div>
                <button className="tour-btn">Book Now</button>
              </div>
            </div>
          ))}
        </div>
      </div>


      {/* Client Reviews Section */}
      <div className="client-reviews">
        <h2>Client Reviews</h2>
        <p>The opinions that clients write about TourNest’s tours and other services</p>

        <div className="review-grid">
          {/* Review 1 */}
          <div className="review-card">
            <img src={chilinh} alt="Client Review 1" />
            <p>
              Mình đã có những trải nghiệm tuyệt vời vào mùa hè năm ngoái. Mình cảm thấy xứng đáng khi đã chọn tour du lịch của TourNest. Cảm ơn và luôn mong đồng hành cùng TourNest trên những tour du lịch sắp tới.
            </p>
            <h4>— Chị Linh - Nha Trang 2024 —</h4>
          </div>

          {/* Review 2 */}
          <div className="review-card">
            <img src={anhmanh} alt="Client Review 2" />
            <p>
              Sau khi có những trải nghiệm tuyệt vời cùng đại gia đình tại Hạ Long, gia đình mình đã lên kế hoạch đi du lịch Đà Nẵng trong thời gian tới. Và không thể thiếu bạn đồng hành với những dịch vụ tận tâm của TourNest. Cảm ơn và sẽ luôn là sự lựa chọn hoàn hảo của gia đình mình.
            </p>
            <h4>— Anh Mạnh - Hạ Long 2024 —</h4>
          </div>

          {/* Review 3 */}
          <div className="review-card">
            <img src={chihanh} alt="Client Review 3" />
            <p>
              Đây là lần đầu đi du lịch cùng nhau sau khi tốt nghiệp, cũng là lần đầu tiên lựa chọn tour của TourNest, chúng mình cảm thấy rất hài lòng từ dịch vụ, nhà hàng, khách sạn, đặc biệt là sự tận tâm từ đội ngũ hướng dẫn viên. Cảm ơn và chúc công ty sẽ phát triển bền bỉ, gắn đình sẽ luôn ủng hộ công ty.
            </p>
            <h4>— Chị Hạnh - Đà Lạt 2024 —</h4>
          </div>
        </div>
      </div>


      {/* Footer Section */}
      <footer className="footer">
        <div className="footer-container">
          {/* Logo & Tagline */}
          <div className="footer-logo">
            <h2><span style={{ color: "#0099ff" }}>Tour</span>Nest</h2>
            <p>Best Travel Agency</p>
          </div>

          {/* Contact Info */}
          <div className="footer-contact">
            <h3>Contact</h3>
            <p>KCNC Hòa Lạc - Thạch Thất - Hà Nội</p>
            <p>(+84) 843197845</p>
            <p>info@vietravel.com</p>
            <div className="footer-social">
              <i className="fab fa-instagram"></i>
              <i className="fab fa-facebook-messenger"></i>
              <i className="fab fa-facebook"></i>
              <i className="fab fa-tiktok"></i>
              <i className="fab fa-zalo"></i>
            </div>
            <button className="footer-call">1900 1839</button>
            <p>From 8:00 - 23:00 daily</p>
          </div>

          {/* Information */}
          <div className="footer-info">
            <h3>Information</h3>
            <ul>
              <li><a href="#">News</a></li>
              <li><a href="#">Help</a></li>
              <li><a href="#">Privacy Policy</a></li>
              <li><a href="#">Terms of Use</a></li>
              <li><a href="#">Personal Data Protection Policy</a></li>
            </ul>
          </div>
        </div>
      </footer>

    </div>
  );
};

export default HomePage;
