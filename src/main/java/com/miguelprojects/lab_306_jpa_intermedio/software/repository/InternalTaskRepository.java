package com.miguelprojects.lab_306_jpa_intermedio.software.repository;

import com.miguelprojects.lab_306_jpa_intermedio.software.model.InternalTask;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InternalTaskRepository extends JpaRepository<InternalTask, Long> {
}
