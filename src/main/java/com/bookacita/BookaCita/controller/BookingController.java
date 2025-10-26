package com.bookacita.BookaCita.controller;

import com.bookacita.BookaCita.dto.BookingRequest;
import com.bookacita.BookaCita.model.Booking;
import com.bookacita.BookaCita.service.BookingService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class BookingController {
    private final BookingService bookingService;

    @PostMapping("/{businessId}")
    public ResponseEntity<Booking> createBooking(
            @PathVariable Long businessId,
            @Valid @RequestBody BookingRequest request
    ) {
        Booking booking = bookingService.createBooking(businessId, request);
        return ResponseEntity.ok(booking);
    }

}
