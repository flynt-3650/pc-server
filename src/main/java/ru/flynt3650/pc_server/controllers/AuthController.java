package ru.flynt3650.pc_server.controllers;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.flynt3650.pc_server.dto.JwtResponseDto;
import ru.flynt3650.pc_server.dto.UserLoginDto;
import ru.flynt3650.pc_server.dto.UserRegistrationDto;
import ru.flynt3650.pc_server.services.UserService;

@RestController
@RequestMapping
public class AuthController {

    private final UserService userService;

    public AuthController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public ResponseEntity<?> register(@Valid @RequestBody UserRegistrationDto registrationDto) {
        userService.registerUser(registrationDto);
        return ResponseEntity.ok().body("User registered successfully");
    }

    @PostMapping("/login")
    public ResponseEntity<JwtResponseDto> login(@Valid @RequestBody UserLoginDto loginDto) {
        String token = userService.loginUser(loginDto);
        return ResponseEntity.ok(new JwtResponseDto(token));
    }
}
