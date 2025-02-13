package com.explorevietnam.controller;

import java.util.List;
// import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.ui.Model;

import com.explorevietnam.entity.Tour;
import com.explorevietnam.service.TourService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class TourController {
    private final TourService tourService;

    public TourController(TourService tourService) {
        this.tourService = tourService;
    }

    @GetMapping("/homepage")
    public String getMethodName(Model model) {
        List<Tour> tours = this.tourService.getAllTour();
        model.addAttribute("tour-list", tours);
        return "homepage";
    }

    @GetMapping("/searchSeason")
    public List<Tour> searchToursSeason(@RequestParam(required = false) String season) {
        return tourService.findToursSeason(season);
    }

    @GetMapping("/hello")
    public String getMethodName1() {
        return "Hello";
    }

}
