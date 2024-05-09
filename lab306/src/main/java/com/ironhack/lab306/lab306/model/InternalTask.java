package com.ironhack.lab306.lab306.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("INTERNAL")
public class InternalTask extends Task {
    // No additional attributes
}