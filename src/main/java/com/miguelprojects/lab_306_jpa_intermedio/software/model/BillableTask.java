package com.miguelprojects.lab_306_jpa_intermedio.software.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "billable_tasks")
@DiscriminatorValue("BILLABLE_TASK")
//si la unieramos por TABLE_PER_CLASE o JOINED haria falta el @PrimaryKeyJoinColumn
//@PrimaryKeyJoinColumn(name = "task_id")
public class BillableTask extends Task {

    @Column(name = "hourly_rate")
    private double hourlyRate;

    public BillableTask() {    }

    public BillableTask(String title, LocalDate dueDate, boolean status, double hourlyRate) {
        super(title, dueDate, status);
        this.hourlyRate = hourlyRate;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        BillableTask that = (BillableTask) o;
        return Double.compare(hourlyRate, that.hourlyRate) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), hourlyRate);
    }
}
