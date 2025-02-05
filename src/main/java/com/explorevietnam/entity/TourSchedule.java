package com.explorevietnam.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tour_schedule")
public class TourSchedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int tourId;
    private int dayNumber;
    private String itinerary;
    private String description;
    private LocalDateTime createdDate;
    private LocalDateTime deletedDate;
    private boolean isDelete;

    public TourSchedule() {
    }

    public TourSchedule(int id, int tourId, int dayNumber, String itinerary, String description,
            LocalDateTime createdDate, LocalDateTime deletedDate, boolean isDelete) {
        this.id = id;
        this.tourId = tourId;
        this.dayNumber = dayNumber;
        this.itinerary = itinerary;
        this.description = description;
        this.createdDate = createdDate;
        this.deletedDate = deletedDate;
        this.isDelete = isDelete;
    }

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

    public int getDayNumber() {
        return dayNumber;
    }

    public void setDayNumber(int dayNumber) {
        this.dayNumber = dayNumber;
    }

    public String getItinerary() {
        return itinerary;
    }

    public void setItinerary(String itinerary) {
        this.itinerary = itinerary;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    @Override
    public String toString() {
        return "TourSchedule [id=" + id + ", tourId=" + tourId + ", dayNumber=" + dayNumber + ", itinerary=" + itinerary
                + ", description=" + description + ", createdDate=" + createdDate + ", deletedDate=" + deletedDate
                + ", isDelete=" + isDelete + "]";
    }
}
