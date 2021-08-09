package com.br.crud.trace.api.exception;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
public class ErrorResponse {

    private LocalDateTime dataHora;
    private String mensagem;
}
