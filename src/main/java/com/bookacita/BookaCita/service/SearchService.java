package com.bookacita.BookaCita.service;

import com.bookacita.BookaCita.model.Business;
import com.bookacita.BookaCita.repository.BusinessRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SearchService {
    private final BusinessRepository businessRepository;

    public List<Business> searchBusinesses(String query, String filter) {
        // Simple example: only using business name for now
        if (query == null || query.isBlank()) {
            return businessRepository.findAll();
        }

        // In future, you can add filtering logic by category, location, etc.
        return businessRepository.findByBusinessNameContainingIgnoreCase(query);
    }
}
