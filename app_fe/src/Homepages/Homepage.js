import React, { useState } from "react";
import "./Homepage.css";
import { FaHotel, FaPlane, FaTree } from "react-icons/fa";
import halong from '../assets/halong.jpg'
import hue from '../assets/hue.jpg'
import cantho from '../assets/cantho.jpg'
import danang from '../assets/danang.jpg'
import taybac from '../assets/taybac.jpg'
import mocchau from '../assets/mocchau.jpg'
import sapa from '../assets/sapa.jpg'
import chilinh from '../assets/chilinh.jpg'
import chihanh from '../assets/chihanh.jpg'
import anhmanh from '../assets/anhmanh.jpg'
const HomePage = () => {
  const [selectedTab, setSelectedTab] = useState("hotels");
  const [budget, setBudget] = useState([2677, 8803]);

  return (
    <div className="homepage">
      {/* Header */}
      <header className="top-header">
        <div className="contact">📞 1900 1839 - From 8:00 AM to 11:00 PM daily.</div>
        <div className="login">Login/Logout</div>
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
        <div className="tabs">
          <button className={selectedTab === "tours" ? "active" : ""} onClick={() => setSelectedTab("tours")}>
            <FaTree /> Tours
          </button>
          <button className={selectedTab === "hotels" ? "active" : ""} onClick={() => setSelectedTab("hotels")}>
            <FaHotel /> Hotels
          </button>
          <button className={selectedTab === "flights" ? "active" : ""} onClick={() => setSelectedTab("flights")}>
            <FaPlane /> Flights
          </button>
        </div>

        {/* Search Form */}
        <div className="search-form">
          <input type="text" placeholder="Enter Your Destination Location" />
          <input type="date" />
          <input type="date" />
          <input type="number" placeholder="Duration" />
          <input type="number" placeholder="Members" />

          {/* Budget Slider */}
          <div className="budget-slider">
            <label>Budget: ${budget[0]} - ${budget[1]}</label>
            <input type="range" min="1000" max="10000" step="100"
              value={budget[0]} onChange={(e) => setBudget([e.target.value, budget[1]])} />
            <input type="range" min="1000" max="10000" step="100"
              value={budget[1]} onChange={(e) => setBudget([budget[0], e.target.value])} />
          </div>

          <button className="search-btn">Search</button>
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
          {/* Tour Card 1 */}
          <div className="tour-card">
            <img src={taybac} alt="Tây Bắc" />
            <div className="tour-info">
              <h3 className="tour-title">Tây Bắc</h3>
              <span className="tour-price">3.999.000 đ</span>
              <ul className="tour-details">
                <li> 3 days and 2 nights</li>
                <li> 5 star</li>
                <li> Transportation</li>
                <li> Food Facilities</li>
              </ul>
              <div className="tour-rating">
                ⭐⭐⭐⭐⭐ <span>2544 views</span>
              </div>
              <button className="tour-btn">Book Now</button>
            </div>
          </div>

          {/* Tour Card 2 */}
          <div className="tour-card">
            <img src={sapa} alt="Sapa" />
            <div className="tour-info">
              <h3 className="tour-title">Sapa</h3>
              <span className="tour-price">3.999.000 đ</span>
              <ul className="tour-details">
                <li> 3 days and 2 nights</li>
                <li> 5 star</li>
                <li> Transportation</li>
                <li> Food Facilities</li>
              </ul>
              <div className="tour-rating">
                ⭐⭐⭐⭐⭐ <span>2544 views</span>
              </div>
              <button className="tour-btn">Book Now</button>
            </div>
          </div>

          {/* Tour Card 3 */}
          <div className="tour-card">
            <img src={mocchau} alt="Mộc Châu" />
            <div className="tour-info">
              <h3 className="tour-title">Mộc Châu</h3>
              <span className="tour-price">3.999.000 đ</span>
              <ul className="tour-details">
                <li> 3 days and 2 nights</li>
                <li> 5 star</li>
                <li> Transportation</li>
                <li> Food Facilities</li>
              </ul>
              <div className="tour-rating">
                ⭐⭐⭐⭐⭐ <span>2544 views</span>
              </div>
              <button className="tour-btn">Book Now</button>
            </div>
          </div>
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
