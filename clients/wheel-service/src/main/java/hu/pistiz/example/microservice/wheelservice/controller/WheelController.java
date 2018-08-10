package hu.pistiz.example.microservice.wheelservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WheelController {

    @Value("${wheel}")
    private String wheel;

    @GetMapping("/")
    public String getWheel() {
        return wheel;
    }
}
