package ru.flynt3650.pc_server.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.flynt3650.pc_server.models.cart.Cart;
import ru.flynt3650.pc_server.models.cart.CartId;
import ru.flynt3650.pc_server.models.pc_components.Pc;
import ru.flynt3650.pc_server.models.users.User;
import ru.flynt3650.pc_server.repositories.CartRepository;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class CartService {

    private final CartRepository cartRepository;
    private final UserService userService;
    private final PcService pcService;

    @Autowired
    public CartService(CartRepository cartRepository, UserService userService, PcService pcService) {
        this.cartRepository = cartRepository;
        this.userService = userService;
        this.pcService = pcService;
    }

    public List<Cart> findAll() {
        return cartRepository.findAll();
    }

    public List<Cart> findByUserId(Integer userId) {
        return cartRepository.findByUserId(userId);
    }

    public Optional<Cart> findCartByIds(Integer userId, Integer pcId) {
        return cartRepository.findCartByIds(userId, pcId);
    }

    @Transactional
    public void save(Cart cart) {
        cartRepository.save(cart);
    }

    @Transactional
    public void delete(Cart cart) {
        cartRepository.delete(cart);
    }

    @Transactional
    public void addPcToUsersCart(Cart cart) {

        Integer userId = cart.getUser().getId();
        User user = userService.findById(userId);

        Integer pcId = cart.getPc().getId();
        Pc pc = pcService.findById(pcId);

        Optional<Cart> optionalCart = findCartByIds(userId, pcId);

        if (optionalCart.isPresent()) {
            Cart existingCart = optionalCart.get();
            existingCart.setQuantity(existingCart.getQuantity() + cart.getQuantity());
        } else {
            Cart newCart = new Cart();
            newCart.setId(new CartId(pcId, userId));
            newCart.setUser(user);
            newCart.setPc(pc);
            newCart.setQuantity(cart.getQuantity());
            save(newCart);
        }
    }

    @Transactional
    public void increaseQuantity(Cart cart) {
        Integer userId = cart.getUser().getId();
        Integer pcId = cart.getPc().getId();

        Optional<Cart> optionalCart = findCartByIds(userId, pcId);

        if (optionalCart.isPresent()) {
            Cart existingCart = optionalCart.get();
            existingCart.setQuantity(existingCart.getQuantity() + 1);
            // Автосохранение через dirty checking
        } else {
            throw new RuntimeException("Cart item not found");
        }
    }

    @Transactional
    public void decreaseQuantity(Cart cart) {
        Integer userId = cart.getUser().getId();
        Integer pcId = cart.getPc().getId();

        Optional<Cart> optionalCart = findCartByIds(userId, pcId);

        if (optionalCart.isPresent()) {
            Cart existingCart = optionalCart.get();
            Integer quantity = existingCart.getQuantity();

            if (quantity > 1) {
                existingCart.setQuantity(quantity - 1);
            } else {
                delete(existingCart);
            }
        } else {
            throw new RuntimeException("Cart item not found");
        }
    }

    @Transactional
    public void removeFromCart(Cart cart) {
        Integer userId = cart.getUser().getId();
        Integer pcId = cart.getPc().getId();

        Optional<Cart> optionalCart = findCartByIds(userId, pcId);

        if (optionalCart.isPresent()) {
            delete(optionalCart.get());
        } else {
            throw new RuntimeException("Cart item not found");
        }
    }


    @Transactional
    public void deleteOnePcFromUsersCart(Cart cart) {

        Integer userId = cart.getUser().getId();
        Integer pcId = cart.getPc().getId();

        Optional<Cart> optionalCart = findCartByIds(userId, pcId);

        if (optionalCart.isPresent()) {
            Cart existingCart = optionalCart.get();
            Integer quantity = existingCart.getQuantity();

            if (quantity > 1) {
                existingCart.setQuantity(quantity - 1);
            } else {
                delete(existingCart); // cart is empty
            }
        } else {
            throw new RuntimeException("How did we get here?");
        }
    }
}
