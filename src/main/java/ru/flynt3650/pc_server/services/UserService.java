package ru.flynt3650.pc_server.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import ru.flynt3650.pc_server.dto.UserLoginDto;
import ru.flynt3650.pc_server.dto.UserRegistrationDto;
import ru.flynt3650.pc_server.models.users.Role;
import ru.flynt3650.pc_server.models.users.User;
import ru.flynt3650.pc_server.repositories.UserRepository;
import ru.flynt3650.pc_server.security.JwtUtil;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final BCryptPasswordEncoder passwordEncoder;
    private final JwtUtil jwtUtil;

    @Autowired
    public UserService(UserRepository userRepository, BCryptPasswordEncoder passwordEncoder, JwtUtil jwtUtil) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
        this.jwtUtil = jwtUtil;
    }

    public void registerUser(UserRegistrationDto registrationDto) {
        if (userRepository.findByEmail(registrationDto.getEmail()).isPresent()) { // Use getter method
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Email already exists");
        }

        User user = User.builder() // build new user
                .email(registrationDto.getEmail()) // Use getter method
                .password(passwordEncoder.encode(registrationDto.getPassword())) // Use getter method
                .role(Role.ROLE_USER)
                .build();

        userRepository.save(user); // save
    }

    public String loginUser(UserLoginDto loginDTO) {
        User user = userRepository.findByEmail(loginDTO.getEmail()) // Use getter method
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Invalid credentials"));

        if (!passwordEncoder.matches(loginDTO.getPassword(), user.getPassword())) { // Use getter method
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Invalid credentials");
        }
        return jwtUtil.generateToken(user.getEmail(), user.getRole().name()); // reply w/ token
    }
}
