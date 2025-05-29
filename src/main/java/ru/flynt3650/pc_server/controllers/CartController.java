package ru.flynt3650.pc_server.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.flynt3650.pc_server.dto.CartDto;
import ru.flynt3650.pc_server.dto.PcDto;
import ru.flynt3650.pc_server.dto.UserDto;
import ru.flynt3650.pc_server.models.cart.Cart;
import ru.flynt3650.pc_server.models.pc_components.Pc;
import ru.flynt3650.pc_server.models.users.User;
import ru.flynt3650.pc_server.services.CartService;
import ru.flynt3650.pc_server.services.PcService;
import ru.flynt3650.pc_server.services.UserService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/cart")
public class CartController {

    @Autowired
    private final CartService cartService;

    @Autowired
    private final ModelMapper modelMapper;

    @Autowired
    private final UserService userService;

    @Autowired
    private final PcService pcService;

    public CartController(CartService cartService, ModelMapper modelMapper, UserService userService, PcService pcService) {
        this.cartService = cartService;
        this.modelMapper = modelMapper;
        this.userService = userService;
        this.pcService = pcService;
    }

    @GetMapping
    public List<CartDto> getCarts() {
        return cartService.findAll()
                .stream()
                .map(this::toCartDto)
                .collect(Collectors.toList());
    }

    @GetMapping("/{userId}")
    public List<CartDto> getUsersCarts(@PathVariable Integer userId) {
        return cartService.findByUserId(userId)
                .stream()
                .map(this::toCartDto)
                .collect(Collectors.toList());
    }

    @PostMapping()
    public void addPcToUsersCart(@RequestBody CartDto cartDto) {
        cartService.addPcToUsersCart(toCart(cartDto));
    }

    @DeleteMapping()
    public void removeOnePcFromUsersCart(@RequestBody CartDto cartDto) {
        cartService.deleteOnePcFromUsersCart(toCart(cartDto));
    }

    @PostMapping("/increase")
    public ResponseEntity<String> increaseQuantity(@RequestBody CartDto cartDto) {
        try {
            cartService.increaseQuantity(toCart(cartDto));
            return ResponseEntity.ok("Quantity increased");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PostMapping("/decrease")
    public ResponseEntity<String> decreaseQuantity(@RequestBody CartDto cartDto) {
        try {
            cartService.decreaseQuantity(toCart(cartDto));
            return ResponseEntity.ok("Quantity decreased");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PostMapping("/remove")
    public ResponseEntity<String> removeFromCart(@RequestBody CartDto cartDto) {
        try {
            cartService.removeFromCart(toCart(cartDto));
            return ResponseEntity.ok("Item removed");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }


    private CartDto toCartDto(Cart cart) {
        return modelMapper.map(cart, CartDto.class);
    }

    private Cart toCart(CartDto cartDto) {
        return modelMapper.map(cartDto, Cart.class);
    }

    private PcDto toPcDto(Pc pc) {
        return modelMapper.map(pc, PcDto.class);
    }

    private Pc toPc(PcDto pcDto) {
        return modelMapper.map(pcDto, Pc.class);
    }

    private User toUser(UserDto userDto) {
        return modelMapper.map(userDto, User.class);
    }

    private UserDto toUserDto(User user) {
        return modelMapper.map(user, UserDto.class);
    }
}
