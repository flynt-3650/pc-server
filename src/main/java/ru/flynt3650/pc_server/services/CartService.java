package ru.flynt3650.pc_server.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.flynt3650.pc_server.models.cart.Cart;
import ru.flynt3650.pc_server.repositories.CartRepository;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class CartService {

    @Autowired
    private final CartRepository cartRepository;

    public CartService(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    public List<Cart> findAll() {
        return cartRepository.findAll();
    }
}
