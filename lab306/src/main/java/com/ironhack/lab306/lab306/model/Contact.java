package com.ironhack.lab306.lab306.model;
import jakarta.persistence.*;

@Entity
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String company;

    @Embedded
    private Name name;

    // Getters and setters
}