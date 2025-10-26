package com.bookacita.BookaCita.repository;

import com.bookacita.BookaCita.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
