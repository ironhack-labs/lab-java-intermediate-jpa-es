package com.ironhack.IntermediateJPA.repository;

import com.ironhack.IntermediateJPA.model.InternalTask;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InternalTaskRepository extends JpaRepository<InternalTask, Long> {
}
