package com.explorevietnam.controller.admin;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import com.explorevietnam.service.TourService;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api")
public class DashBoardController {
    private final TourService tourService;

    public DashBoardController(TourService tourService) {
        this.tourService = tourService;
    }

    @GetMapping("/tour/db")
    public RedirectView redirectToFrontend() {
        return new RedirectView("http://localhost:3000/admin");
    }
}
