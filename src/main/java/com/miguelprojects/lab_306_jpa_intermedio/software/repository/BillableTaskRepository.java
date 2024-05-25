package com.miguelprojects.lab_306_jpa_intermedio.software.repository;

import com.miguelprojects.lab_306_jpa_intermedio.software.model.BillableTask;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillableTaskRepository extends JpaRepository<BillableTask, Long> {
}
