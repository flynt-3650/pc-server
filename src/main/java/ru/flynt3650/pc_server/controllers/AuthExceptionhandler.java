package ru.flynt3650.pc_server.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import ru.flynt3650.pc_server.util.ExceptionResponse;

@ControllerAdvice
public class AuthExceptionhandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(UsernameNotFoundException.class)
    public ResponseEntity<ExceptionResponse> handleUsernameNotFoundException(UsernameNotFoundException ex) {
        ExceptionResponse er = new ExceptionResponse(System.currentTimeMillis(), ex.getMessage());
        return new ResponseEntity<>(er, HttpStatus.NOT_FOUND);
    }
}