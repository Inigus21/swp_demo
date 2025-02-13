package com.explorevietnam.model;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TicketPriceModel {
    private long id;
    private String ageGroup;
    private float price;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private boolean isDelete;
}
