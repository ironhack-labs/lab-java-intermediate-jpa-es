package com.miguelprojects.lab_306_jpa_intermedio.company.repository;

import com.miguelprojects.lab_306_jpa_intermedio.company.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}
