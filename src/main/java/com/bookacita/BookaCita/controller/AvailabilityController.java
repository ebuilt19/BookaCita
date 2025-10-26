package com.bookacita.BookaCita.controller;

import com.bookacita.BookaCita.model.Availability;
import com.bookacita.BookaCita.service.AvailabilityService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/availability")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class AvailabilityController {
    private final AvailabilityService availabilityService;

    @PostMapping("/{businessId}")
    public ResponseEntity<Availability> postAvailability(
            @PathVariable Long businessId,
            @RequestBody Availability availability
    ) {
        return ResponseEntity.ok(availabilityService.postAvailability(businessId, availability));
    }

    @GetMapping("/{businessId}")
    public ResponseEntity<List<Availability>> getAvailability(
            @PathVariable Long businessId
    ) {
        return ResponseEntity.ok(availabilityService.getAvailability(businessId));
    }
}
