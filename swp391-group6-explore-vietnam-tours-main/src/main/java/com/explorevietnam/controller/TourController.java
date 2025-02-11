package com.explorevietnam.controller;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.explorevietnam.entity.Tour;
import com.explorevietnam.service.TourService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
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

}
