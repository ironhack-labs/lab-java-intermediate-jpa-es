package com.miguelprojects.lab_306_jpa_intermedio.software.repository;

import com.miguelprojects.lab_306_jpa_intermedio.software.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TaskRepository extends JpaRepository<Task, Long> {
}
