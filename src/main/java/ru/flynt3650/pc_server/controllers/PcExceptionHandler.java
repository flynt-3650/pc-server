package ru.flynt3650.pc_server.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import ru.flynt3650.pc_server.util.ExceptionResponse;
import ru.flynt3650.pc_server.util.exceptions.PcNotFoundException;
import ru.flynt3650.pc_server.util.exceptions.PcNotSavedException;
import ru.flynt3650.pc_server.util.exceptions.PcNotUpdatedException;

@RestControllerAdvice
public class PcExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(PcNotSavedException.class)
    public ResponseEntity<ExceptionResponse> handleDuplicatePcNameException(PcNotSavedException ex) {
        ExceptionResponse er = new ExceptionResponse(
                System.currentTimeMillis(), ex.getMessage()
        );
        return new ResponseEntity<>(er, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(PcNotFoundException.class)
    public ResponseEntity<ExceptionResponse> handlePcNotFoundException(PcNotFoundException ex) {
        ExceptionResponse er = new ExceptionResponse(
                System.currentTimeMillis(), ex.getMessage()
        );
        return new ResponseEntity<>(er, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(PcNotUpdatedException.class)
    public ResponseEntity<ExceptionResponse> handleConstraintViolationException(PcNotUpdatedException ex) {
        ExceptionResponse er = new ExceptionResponse(
                System.currentTimeMillis(), ex.getMessage()
        );
        return new ResponseEntity<>(er, HttpStatus.BAD_REQUEST);
    }
}