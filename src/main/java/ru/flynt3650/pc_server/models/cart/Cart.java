package ru.flynt3650.pc_server.models.cart;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import ru.flynt3650.pc_server.models.pc_components.Pc;
import ru.flynt3650.pc_server.models.users.User;

@Getter
@Setter
@Entity
@ToString
@Table(name = "pc_cart")
public class Cart {

    @EmbeddedId
    private CartId id;

    @ManyToOne
    @MapsId("pcId")
    @JoinColumn(name = "pc_id")
    private Pc pc;

    @ManyToOne
    @MapsId("appUserId")
    @JoinColumn(name = "app_user_id")
    private User user;

    @Column(name = "quantity")
    private Integer quantity;

}