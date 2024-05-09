package com.ironhack.lab306.lab306.model;
import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "task_type")
public abstract class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private LocalDate dueDate;
    private boolean status;

    // Getters and setters
}