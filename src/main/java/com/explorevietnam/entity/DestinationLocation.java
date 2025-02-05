package com.explorevietnam.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "destination_location")
public class DestinationLocation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DestinationLocation() {
    }

    public DestinationLocation(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "destinationLocation [id=" + id + ", name=" + name + "]";
    }

}