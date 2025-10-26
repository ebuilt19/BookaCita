package com.bookacita.BookaCita.service;

import com.bookacita.BookaCita.model.Business;
import com.bookacita.BookaCita.repository.BusinessRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BusinessService {
    private final BusinessRepository repo;

    public Business signup(Business business) {
        return repo.save(business);
    }

    public List<Business> search(String query) {
        return repo.findByBusinessNameContainingIgnoreCase(query);
    }
}
