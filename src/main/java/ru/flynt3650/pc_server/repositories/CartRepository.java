package ru.flynt3650.pc_server.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ru.flynt3650.pc_server.models.cart.Cart;
import ru.flynt3650.pc_server.models.cart.CartId;

import java.util.List;
import java.util.Optional;

public interface CartRepository extends JpaRepository<Cart, CartId> {

    List<Cart> findByUserId(@Param("userId") Integer userId);

    @Query("SELECT c FROM Cart c WHERE c.id.pcId = :pcId AND c.id.appUserId = :userId")
    Optional<Cart> findCartByIds(@Param("userId") Integer userId, @Param("pcId") Integer pcId);
}

