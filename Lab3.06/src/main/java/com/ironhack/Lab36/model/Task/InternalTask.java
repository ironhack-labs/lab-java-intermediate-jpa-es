package com.ironhack.Lab36.model.Task;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "internal_tasks")
public class InternalTask extends Task {
}
