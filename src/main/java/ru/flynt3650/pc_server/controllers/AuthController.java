package ru.flynt3650.pc_server.controllers;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;
import ru.flynt3650.pc_server.dto.JwtResponseDto;
import ru.flynt3650.pc_server.dto.LoginRegDto;
import ru.flynt3650.pc_server.dto.UserDto;
import ru.flynt3650.pc_server.models.users.Role;
import ru.flynt3650.pc_server.services.UserService;

@RestController
@RequestMapping
public class AuthController {

    private final UserService userService;

    public AuthController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public ResponseEntity<?> register(@Valid @RequestBody LoginRegDto registrationDto) {
        userService.registerUser(registrationDto);
        return ResponseEntity.ok().body("User registered successfully");
    }

    @PostMapping("/login")
    public ResponseEntity<JwtResponseDto> login(@Valid @RequestBody LoginRegDto loginDto) {
        String token = userService.loginUser(loginDto);
        return ResponseEntity.ok(new JwtResponseDto(token));
    }

    @GetMapping("/me")
    public UserDto getCurrentUserDetails() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String currentPrincipalName = authentication.getName();
        String authority = authentication.getAuthorities().iterator().next().getAuthority();
        
        UserDto userDto = new UserDto();
        userDto.setEmail(currentPrincipalName);
        userDto.setRole(Role.valueOf(authority));

        return userDto;
    }
}
