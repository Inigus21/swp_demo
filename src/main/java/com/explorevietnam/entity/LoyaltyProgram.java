package com.explorevietnam.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "loyalty_program")
public class LoyaltyProgram {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int accountId;
    private int point;
    private String membershipTies;
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

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public String getMembershipTies() {
        return membershipTies;
    }

    public void setMembershipTies(String membershipTies) {
        this.membershipTies = membershipTies;
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

    public LoyaltyProgram() {
    }

    public LoyaltyProgram(int id, int accountId, int point, String membershipTies, LocalDateTime createdDate,
            LocalDateTime updatedDate, LocalDateTime deletedDate, boolean isDelete) {
        this.id = id;
        this.accountId = accountId;
        this.point = point;
        this.membershipTies = membershipTies;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
        this.deletedDate = deletedDate;
        this.isDelete = isDelete;
    }

    @Override
    public String toString() {
        return "LoyaltyProgram [id=" + id + ", accountId=" + accountId + ", point=" + point + ", membershipTies="
                + membershipTies + ", createdDate=" + createdDate + ", updatedDate=" + updatedDate + ", deletedDate="
                + deletedDate + ", isDelete=" + isDelete + "]";
    }

}
