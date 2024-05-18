package com.ironhack.IntermediateJPA.model;

import jakarta.persistence.Entity;

@Entity
public class BillableTask extends Task {
    private double hourlyRate;

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
}
