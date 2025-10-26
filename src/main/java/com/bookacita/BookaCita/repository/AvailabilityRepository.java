package com.bookacita.BookaCita.repository;

import com.bookacita. BookaCita.model.Availability;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface AvailabilityRepository extends JpaRepository<Availability, Long> {
    List<Availability> findByBusinessId(Long businessId);
}
