package ru.flynt3650.pc_server.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.flynt3650.pc_server.models.users.Role;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    @NotNull
    String email;

    @NotNull
    Role role;
}