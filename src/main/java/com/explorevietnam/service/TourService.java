package com.explorevietnam.service;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.springframework.stereotype.Service;

import com.explorevietnam.entity.Tour;
import com.explorevietnam.repository.TourRepository;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class TourService {
    private final ObjectMapper objectMapper = new ObjectMapper();

    private final TourRepository tourRepository;

    public TourService(TourRepository tourRepository) {
        this.tourRepository = tourRepository;
    }

    public JsonNode getAllTours() {
        try {
            InputStream inputStream = getClass().getClassLoader().getResourceAsStream("data/tour.json");
            if (inputStream == null) {
                throw new RuntimeException("File tours.json not found in resources");
            }
            return objectMapper.readTree(inputStream).get("tours");
        } catch (IOException e) {
            throw new RuntimeException("Error reading tours.json", e);
        }
    }

}
