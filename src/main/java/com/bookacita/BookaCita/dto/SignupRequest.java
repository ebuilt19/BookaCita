package com.bookacita.BookaCita.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class SignupRequest {
    @NotBlank
    private String businessName;

    @Email
    private String email;

    @NotBlank
    private String phone;

    @NotBlank
    private String location;
}
