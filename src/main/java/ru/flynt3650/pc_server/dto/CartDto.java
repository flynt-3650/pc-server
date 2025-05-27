package ru.flynt3650.pc_server.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * DTO for {@link ru.flynt3650.pc_server.models.cart.Cart}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CartDto {
    private CartIdDto id;
    private PcDto pc;
    private UserDto user;
    private Integer quantity;
}