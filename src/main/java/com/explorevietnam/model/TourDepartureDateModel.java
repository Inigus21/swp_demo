package com.explorevietnam.model;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TourDepartureDateModel {
    private long id;
    private LocalDateTime departureDate;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private boolean isDelete;
}
