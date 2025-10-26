package com.bookacita.BookaCita.service;

import com.bookacita.BookaCita.dto.BookingRequest;
import com.bookacita.BookaCita.model.Booking;
import com.bookacita.BookaCita.model.Business;
import com.bookacita.BookaCita.repository.BookingRepository;
import com.bookacita.BookaCita.repository.BusinessRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookingService {
    private final BookingRepository bookingRepo;
    private final BusinessRepository businessRepo;

    public Booking createBooking(Long businessId, BookingRequest request) {
        Business business = businessRepo.findById(businessId)
                .orElseThrow(() -> new RuntimeException("Business not found"));

        Booking booking = Booking.builder()
                .customerName(request.getCustomerName())
                .date(request.getDate())
                .time(request.getTime())
                .business(business)
                .build();

        return bookingRepo.save(booking);
    }

}
