import React from 'react';
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import Header from './component/Header';
import Footer from './component/Footer';
import Homepage from './Homepages/Homepage';
import Login from './Homepages/Login';
import TourList from './Homepages/TourList';
import TourDetail from './Homepages/TourDetail';
import Checkout from './Homepages/Customer/Checkout';
import Payment from './Homepages/Admin/Payment';
import OrderHistory from './Homepages/Customer/OrderHistory';
import Feedback from './Homepages/Customer/Feedback';
import PersonalInfo from './Homepages/Customer/PersonalInfo';
import ChangePassword from './Homepages/ChangePassword';
import AdminHome from './Homepages/Admin/AdminHome';
import UserList from './Homepages/Admin/UserList';
import UserDetail from './Homepages/Admin/UserDetail';
import BookingList from './Homepages/Admin/BookingList';
import Policies from './Homepages/Admin/Policies';
import Revenue from './Homepages/Admin/Revenue';
import StaffDetail from './Homepages/Admin/StaffDetail';
import StaffList from './Homepages/Admin/StaffList';
import VerifyInformation from './Homepages/Customer/VerifyInformation';
// import AppRoutes from './routes/AppRoutes';
import './App.css';

function App() {
  return (

    <div>

      <Routes>
        <Route path="/" element={<Homepage />} />
        <Route path="/login" element={<Login />} />
        <Route path="/tours" element={<TourList />} />
        <Route path="/tour/:id" element={<TourDetail />} />
        <Route path="/checkout" element={<Checkout />} />
        <Route path="/payment" element={<Payment />} />
        <Route path="/order-history" element={<OrderHistory />} />
        <Route path="/feedback" element={<Feedback />} />
        <Route path="/personal-info" element={<PersonalInfo />} />
        <Route path="/change-password" element={<ChangePassword />} />
        <Route path="/admin" element={<AdminHome />} />
        <Route path="/admin/users" element={<UserList />} />
        <Route path="/admin/user/:id" element={<UserDetail />} />
        <Route path="/admin/bookings" element={<BookingList />} />
        <Route path="/admin/policies" element={<Policies />} />
        <Route path="/admin/revenue" element={<Revenue />} />
        <Route path="/admin/staff" element={<StaffList />} />
        <Route path="/admin/staff/:id" element={<StaffDetail />} />
        <Route path="/customer/verify" element={<VerifyInformation />} />
      </Routes>

    </div>
  );
}

export default App;
