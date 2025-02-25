package ru.flynt3650.pc_server.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record UserRegistrationDto(
        @Email @NotBlank String email,
        @NotBlank @Size(min = 4) String password
) {
}