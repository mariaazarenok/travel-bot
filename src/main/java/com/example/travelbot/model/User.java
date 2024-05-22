package com.example.travelbot.model;


import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Component;

@Component
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    @Column(name = "userName", nullable = false)
    private String userName;
    @Column(name = "email", nullable = false)
    private String email;

}
