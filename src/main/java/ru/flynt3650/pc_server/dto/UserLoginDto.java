package ru.flynt3650.pc_server.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record UserLoginDto(
        @Email @NotBlank String email,
        @NotBlank String password
) {
}
