package com.bookacita.BookaCita.repository;

import com.bookacita.BookaCita.model.Business;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BusinessRepository extends JpaRepository<Business, Long> {
    List<Business> findByBusinessNameContainingIgnoreCase(String name);
}
