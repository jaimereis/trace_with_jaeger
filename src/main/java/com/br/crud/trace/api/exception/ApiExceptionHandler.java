package com.br.crud.trace.api.exception;

import com.br.crud.trace.model.exception.ContractNotFoundException;
import com.br.crud.trace.model.exception.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class ApiExceptionHandler  {

    @ExceptionHandler(EmptyResultDataAccessException.class)
    public ResponseEntity<?> EmptyResultDataAccessException(EmptyResultDataAccessException e) {
        var exception = ErrorResponse.builder()
                .dataHora(LocalDateTime.now())
                .mensagem(e.getMessage())
                .build();

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(exception);
    }

    @ExceptionHandler(ContractNotFoundException.class)
    public ResponseEntity<?> ContractNotFoundException(ContractNotFoundException e) {
        var exception = ErrorResponse.builder()
                .dataHora(LocalDateTime.now())
                .mensagem(e.getMessage())
                .build();

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(exception);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<?> MethodArgumentNotValidException(MethodArgumentNotValidException e) {
        var exception = ErrorResponse.builder()
                .dataHora(LocalDateTime.now())
                .mensagem(e.getFieldError().getField() + " Não pode ser vazio ou null")
                .build();

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(exception);
    }
}
