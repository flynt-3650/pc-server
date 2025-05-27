package ru.flynt3650.pc_server.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * DTO for {@link ru.flynt3650.pc_server.models.cart.CartId}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CartIdDto {
    private Integer pcId;
    private Integer appUserId;
}