package com.explorevietnam.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tour_departure_date")
public class TourDepartureDate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int tour_id;
    private LocalDateTime departureDate;
    private LocalDateTime createdDate;
    private LocalDateTime deletedDate;
    private boolean isDelete;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTour_id() {
        return tour_id;
    }

    public void setTour_id(int tour_id) {
        this.tour_id = tour_id;
    }

    public LocalDateTime getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(LocalDateTime departureDate) {
        this.departureDate = departureDate;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
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

    public TourDepartureDate() {
    }

    public TourDepartureDate(int id, int tour_id, LocalDateTime departureDate, LocalDateTime createdDate,
            LocalDateTime deletedDate, boolean isDelete) {
        this.id = id;
        this.tour_id = tour_id;
        this.departureDate = departureDate;
        this.createdDate = createdDate;
        this.deletedDate = deletedDate;
        this.isDelete = isDelete;
    }

    @Override
    public String toString() {
        return "TourDepartureDate [id=" + id + ", tour_id=" + tour_id + ", departureDate=" + departureDate
                + ", createdDate=" + createdDate + ", deletedDate=" + deletedDate + ", isDelete=" + isDelete + "]";
    }

}
