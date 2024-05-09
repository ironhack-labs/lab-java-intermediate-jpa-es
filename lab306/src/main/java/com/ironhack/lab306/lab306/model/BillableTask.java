package com.ironhack.lab306.lab306.model;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue("BILLABLE")
public class BillableTask extends Task {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private double hourlyRate;

    // Getters and setters
}