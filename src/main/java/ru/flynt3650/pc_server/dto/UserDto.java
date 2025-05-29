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
    private Integer id;

    @NotNull
    private String email;

    @NotNull
    private Role role;
}