package ru.flynt3650.pc_server.models.cart;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CartId implements Serializable {
    private Integer pcId;
    private Integer appUserId;
}
