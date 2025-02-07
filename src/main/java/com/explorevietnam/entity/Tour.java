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
import lombok.*;

@ToString
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tours")
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
}
