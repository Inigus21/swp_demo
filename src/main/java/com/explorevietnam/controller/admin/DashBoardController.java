package com.explorevietnam.controller.admin;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.explorevietnam.entity.Tour;
import com.explorevietnam.service.TourService;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api")
public class DashBoardController {
    private final TourService tourService;

    public DashBoardController(TourService tourService) {
        this.tourService = tourService;
    }

    // @GetMapping("/tour")
    // public List<Tour> getAllTours() {
    // List<Tour> tours = this.tourService.getAllTours();
    // return tours; // Trả về danh sách tour dưới dạng JSON
    // }
    @GetMapping("/tour/db")
    public void getAllTours() {
        List<Tour> tours = this.tourService.getAllTours();
        for (Tour tour : tours) {
            System.out.println(tour);
        }
    }
}
