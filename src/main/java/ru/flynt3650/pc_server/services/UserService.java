package ru.flynt3650.pc_server.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
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
import ru.flynt3650.pc_server.security.SecurityConfig;

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
        if (userRepository.findByEmail(registrationDto.email()).isPresent()) { // check if user already exists
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Email already exists");
        }

        User user = User.builder() // build new user
                .email(registrationDto.email())
                .password(passwordEncoder.encode(registrationDto.password()))
                .role(Role.ROLE_USER)
                .build();

        userRepository.save(user); // save
    }

    public String loginUser(UserLoginDto loginDTO) {
        User user = userRepository.findByEmail(loginDTO.email()) // check if user does not exist
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Invalid credentials"));

        if (!passwordEncoder.matches(loginDTO.password(), user.getPassword())) { // check if user credentials are OK
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Invalid credentials");
        }
        return jwtUtil.generateToken(user.getEmail(), user.getRole().name()); // reply w/ token
    }
}
