package com.example.travelbot.model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Component;

@Component
public class Route {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "start_location", nullable = false)
    private String startLocation;
    @Column(name = "end_location", nullable = false)
    private String endLocation;
    @Column(name = "description", nullable = false)
    private String description;
}
