package com.explorevietnam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.explorevietnam.entity.Tour;
import java.util.List;

@Repository
public interface TourRepository extends JpaRepository<Tour, Long> {
    Tour save(Tour newTour);

    Tour findById(long id);

    List<Tour> findAll();

    @Query("SELECT t FROM Tour t WHERE t.bestTime = :season")
    List<Tour> findByBestTime(String season);
}
