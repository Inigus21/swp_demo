package com.explorevietnam.model;

import com.explorevietnam.enums.CostRange;
import com.explorevietnam.enums.Region;
import com.explorevietnam.enums.Type;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TourModel {
    private long id;
    private String name;
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
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private boolean isDelete;
}