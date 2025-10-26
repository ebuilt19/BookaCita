package com.bookacita.BookaCita.controller;

import com.bookacita.BookaCita.model.Business;
import com.bookacita.BookaCita.service.SearchService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/search")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class SearchController {
    private final SearchService searchService;

    @GetMapping
    public ResponseEntity<List<Business>> search(
            @RequestParam(required = false) String query,
            @RequestParam(required = false) String filter
    ) {
        return ResponseEntity.ok(searchService.searchBusinesses(query, filter));
    }
}
