package com.ironhack.IntermediateJPA.repository;

import com.ironhack.IntermediateJPA.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
