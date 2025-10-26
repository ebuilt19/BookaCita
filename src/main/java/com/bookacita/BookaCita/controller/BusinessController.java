package com.bookacita.BookaCita.controller;

import com.bookacita.BookaCita.dto.SignupRequest;
import com.bookacita.BookaCita.model.Business;
import com.bookacita.BookaCita.service.BusinessService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/business")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class BusinessController {
    private final BusinessService service;

    @PostMapping("/signup")
    public ResponseEntity<Business> signup(@Valid @RequestBody SignupRequest request) {
        Business business = new Business();
        business.setBusinessName(request.getBusinessName());
        business.setEmail(request.getEmail());
        business.setPhone(request.getPhone());
        business.setLocation(request.getLocation());
        return ResponseEntity.ok(service.signup(business));
    }


    @GetMapping("/search")
    public ResponseEntity<List<Business>> search(@RequestParam String query) {
        return ResponseEntity.ok(service.search(query));
    }
}
