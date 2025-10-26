package com.bookacita.BookaCita.service;

import com.bookacita.BookaCita.model.Availability;
import com.bookacita.BookaCita.model.Business;
import com.bookacita.BookaCita.repository.AvailabilityRepository;
import com.bookacita.BookaCita.repository.BusinessRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AvailabilityService {
    private final AvailabilityRepository availabilityRepo;
    private final BusinessRepository businessRepo;

    public Availability postAvailability(Long businessId, Availability availability) {
        Business business = businessRepo.findById(businessId)
                .orElseThrow(() -> new RuntimeException("Business not found"));
        availability.setBusiness(business);
        return availabilityRepo.save(availability);
    }

    public List<Availability> getAvailability(Long businessId) {
        return availabilityRepo.findByBusinessId(businessId);
    }
}
