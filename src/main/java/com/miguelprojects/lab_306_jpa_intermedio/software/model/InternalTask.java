package com.miguelprojects.lab_306_jpa_intermedio.software.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "internal_tasks")
@DiscriminatorValue("INTERNAL_TASK")
//si la unieramos por TABLE_PER_CLASE o JOINED haria falta el @PrimaryKeyJoinColumn
//@PrimaryKeyJoinColumn(name = "task_id")
public class InternalTask extends Task {

    public InternalTask() {    }

    public InternalTask(String title, LocalDate dueDate, boolean status) {
        super(title, dueDate, status);
    }
}
