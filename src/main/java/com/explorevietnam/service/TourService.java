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

    public List<Tour> getAllTours() {
        List<Tour> tours = this.tourRepository.findAll();
        return tours;
    }

}
