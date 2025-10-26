package com.bookacita.BookaCita.dto;

import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
public class BookingRequest {
    @NotBlank
    private String customerName;

    @NotNull
    @FutureOrPresent(message = "Booking date must be today or in the future")
    private LocalDate date;

    @NotNull
    private LocalTime time;
}
