package com.explorevietnam.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.explorevietnam.entity.Tour;
import com.explorevietnam.repository.TourRepository;

@Service
public class TourService {
    private final TourRepository tourRepository;

    public TourService(TourRepository tourRepository) {
        this.tourRepository = tourRepository;
    }

    public Tour handleTour(Tour newTour) {
        Tour tour = this.tourRepository.save(newTour);
        return tour;
    }

    public Tour getTourById(long id) {
        return this.tourRepository.findById(id);
    }

    public List<Tour> getAllTour() {
        return this.tourRepository.findAll();
    }

    public void deleteTourById(long id) {
        this.tourRepository.deleteById(id);
    }
}
