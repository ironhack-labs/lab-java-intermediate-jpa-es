package com.ironhack.IntermediateJPA.repository;

import com.ironhack.IntermediateJPA.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}
