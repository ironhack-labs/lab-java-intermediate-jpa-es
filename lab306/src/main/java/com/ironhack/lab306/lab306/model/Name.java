package com.ironhack.lab306.lab306.model;
import jakarta.persistence.Embeddable;

@Embeddable
public class Name {
    private String firstName;
    private String lastName;
    private String middleName;
    private String salutation;

    // Getters and setters
}