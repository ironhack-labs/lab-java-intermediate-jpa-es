package com.ironhack.Lab36.model.Task;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "billable_tasks")
public class BillableTask extends Task {

    @Column(name = "hourly_rate")
    private String hourlyRate;
    //private BigDecimal hourlyRate;


    public String getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(String hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
}
