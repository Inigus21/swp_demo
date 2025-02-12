package com.explorevietnam.controller;

import com.explorevietnam.service.TourService;
import com.fasterxml.jackson.databind.JsonNode;

import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

@RestController
@RequestMapping("/api")
public class TourController {
    private final TourService tourService;

    public TourController(TourService tourService) {
        this.tourService = tourService;
    }

    @GetMapping("/tours")
    public void redirectToHomepage(HttpServletResponse response) throws IOException {
        response.sendRedirect("http://localhost:3000");
    }

    @GetMapping("/register")
    public RedirectView redirectToRegister() {
        return new RedirectView("http://localhost:3000/signup");
    }
}
