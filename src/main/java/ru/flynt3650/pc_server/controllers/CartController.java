package ru.flynt3650.pc_server.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.flynt3650.pc_server.dto.CartDto;
import ru.flynt3650.pc_server.models.cart.Cart;
import ru.flynt3650.pc_server.models.cart.CartId;
import ru.flynt3650.pc_server.services.CartService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/cart")
public class CartController {

    @Autowired
    private final CartService cartService;

    @Autowired
    private final ModelMapper modelMapper;

    public CartController(CartService cartService, ModelMapper modelMapper) {
        this.cartService = cartService;
        this.modelMapper = modelMapper;
    }

    @GetMapping
    public List<CartDto> getCarts() {
        return cartService.findAll()
                .stream()
                .map(this::toCartDto)
                .collect(Collectors.toList());
    }

    private CartDto toCartDto(Cart cart) {
        return modelMapper.map(cart, CartDto.class);
    }

    private Cart toCart(CartDto cartDto) {
        return modelMapper.map(cartDto, Cart.class);
    }
}
