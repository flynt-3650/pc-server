package ru.flynt3650.pc_server.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginRegDto {

    @Email
    @NotBlank
    private String email;

    @NotBlank
    @Size(min = 4, message = "Password must be at least 4 characters")
    private String password;
}
