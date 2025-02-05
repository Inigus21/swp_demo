package com.explorevietnam.entity;

import java.time.LocalDateTime;

import com.explorevietnam.enums.CostRange;
import com.explorevietnam.enums.Region;
import com.explorevietnam.enums.Type;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tour")
public class Tour {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private int category_id;
    private Region region;
    private Type type;
    private CostRange costRange;
    private float price;
    private String suitableFor;
    private String bestTime;
    private String cuisine;
    private String duration;
    private String sightseeing;
    private int maxCapacity;
    private int availableSlot;
    private int departureLocationId;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private LocalDateTime deletedDate;
    private boolean isDelete;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public CostRange getCostRange() {
        return costRange;
    }

    public void setCostRange(CostRange costRange) {
        this.costRange = costRange;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getSuitableFor() {
        return suitableFor;
    }

    public void setSuitableFor(String suitableFor) {
        this.suitableFor = suitableFor;
    }

    public String getBestTime() {
        return bestTime;
    }

    public void setBestTime(String bestTime) {
        this.bestTime = bestTime;
    }

    public String getCuisine() {
        return cuisine;
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getSightseeing() {
        return sightseeing;
    }

    public void setSightseeing(String sightseeing) {
        this.sightseeing = sightseeing;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public int getAvailableSlot() {
        return availableSlot;
    }

    public void setAvailableSlot(int availableSlot) {
        this.availableSlot = availableSlot;
    }

    public int getDepartureLocationId() {
        return departureLocationId;
    }

    public void setDepartureLocationId(int departureLocationId) {
        this.departureLocationId = departureLocationId;
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

    public Tour() {
    }

    public Tour(long id, String name, int category_id, Region region, Type type, CostRange costRange, float price,
            String suitableFor, String bestTime, String cuisine, String duration, String sightseeing, int maxCapacity,
            int availableSlot, int departureLocationId, LocalDateTime createdDate, LocalDateTime updatedDate,
            LocalDateTime deletedDate, boolean isDelete) {
        this.id = id;
        this.name = name;
        this.category_id = category_id;
        this.region = region;
        this.type = type;
        this.costRange = costRange;
        this.price = price;
        this.suitableFor = suitableFor;
        this.bestTime = bestTime;
        this.cuisine = cuisine;
        this.duration = duration;
        this.sightseeing = sightseeing;
        this.maxCapacity = maxCapacity;
        this.availableSlot = availableSlot;
        this.departureLocationId = departureLocationId;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
        this.deletedDate = deletedDate;
        this.isDelete = isDelete;
    }

    @Override
    public String toString() {
        return "Tour [id=" + id + ", name=" + name + ", category_id=" + category_id + ", region=" + region + ", type="
                + type + ", costRange=" + costRange + ", price=" + price + ", suitableFor=" + suitableFor
                + ", bestTime=" + bestTime + ", cuisine=" + cuisine + ", duration=" + duration + ", sightseeing="
                + sightseeing + ", maxCapacity=" + maxCapacity + ", availableSlot=" + availableSlot
                + ", departureLocationId=" + departureLocationId + ", createdDate=" + createdDate + ", updatedDate="
                + updatedDate + ", deletedDate=" + deletedDate + ", isDelete=" + isDelete + "]";
    }

}
