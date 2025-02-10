package com.explorevietnam.entity;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.*;

@ToString
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "loyalty_programs")
public class LoyaltyProgram {

    @Id
    @Column(name = "account_id")
    private long id;

    @Column(nullable = false)
    private int point;

    @Column(name = "membership_tier", nullable = false)
    private String membershipTier;

    @OneToOne
    @MapsId
    @JoinColumn(name = "account_id")
    private Account account;

    @CreatedDate
    @Column(name = "created_date", nullable = false, updatable = false)
    private LocalDateTime createdDate;

    @LastModifiedDate
    @Column(name = "updated_date")
    private LocalDateTime updatedDate;

    @Column(name = "is_delete", nullable = false)
    private boolean isDelete;
}
