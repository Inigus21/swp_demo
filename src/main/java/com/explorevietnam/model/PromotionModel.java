package com.explorevietnam.model;

import lombok.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PromotionModel {
    private long id;
    private String title;
    private float discountPercentage;
    private LocalDate startDate;
    private LocalDate endDate;
    private String description;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private boolean isDelete;
}
