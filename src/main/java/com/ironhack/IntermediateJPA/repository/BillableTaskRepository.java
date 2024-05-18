package com.ironhack.IntermediateJPA.repository;

import com.ironhack.IntermediateJPA.model.BillableTask;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillableTaskRepository extends JpaRepository<BillableTask, Long> {
}
