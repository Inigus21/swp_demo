package com.explorevietnam.entity;

import java.time.LocalDateTime;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "booking")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int tourId;
    private int accountId;
    private int travelGuideId;
    private int customerNumber;
    private LocalDateTime bookingDate;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private LocalDateTime deletedDate;
    private boolean isDelete;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTourId() {
        return tourId;
    }

    public void setTourId(int tourId) {
        this.tourId = tourId;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public int getTravelGuideId() {
        return travelGuideId;
    }

    public void setTravelGuideId(int travelGuideId) {
        this.travelGuideId = travelGuideId;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public LocalDateTime getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(LocalDateTime bookingDate) {
        this.bookingDate = bookingDate;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public LocalDateTime getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(LocalDateTime updatedDate) {
        this.updatedDate = updatedDate;
    }

    public LocalDateTime getDeletedDate() {
        return deletedDate;
    }

    public void setDeletedDate(LocalDateTime deletedDate) {
        this.deletedDate = deletedDate;
    }

    public boolean isDelete() {
        return isDelete;
    }

    public void setDelete(boolean isDelete) {
        this.isDelete = isDelete;
    }

    public Booking() {
    }

    public Booking(int id, int tourId, int accountId, int travelGuideId, int customerNumber, LocalDateTime bookingDate,
            LocalDateTime createdDate, LocalDateTime updatedDate, LocalDateTime deletedDate, boolean isDelete) {
        this.id = id;
        this.tourId = tourId;
        this.accountId = accountId;
        this.travelGuideId = travelGuideId;
        this.customerNumber = customerNumber;
        this.bookingDate = bookingDate;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
        this.deletedDate = deletedDate;
        this.isDelete = isDelete;
    }

    @Override
    public String toString() {
        return "Booking [id=" + id + ", tourId=" + tourId + ", accountId=" + accountId + ", travelGuideId="
                + travelGuideId + ", customerNumber=" + customerNumber + ", bookingDate=" + bookingDate
                + ", createdDate=" + createdDate + ", updatedDate=" + updatedDate + ", deletedDate=" + deletedDate
                + ", isDelete=" + isDelete + "]";
    }

}
