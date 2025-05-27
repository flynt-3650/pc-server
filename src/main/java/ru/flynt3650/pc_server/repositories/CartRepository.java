package ru.flynt3650.pc_server.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.flynt3650.pc_server.models.cart.Cart;

public interface CartRepository extends JpaRepository<Cart, Integer> {
}
