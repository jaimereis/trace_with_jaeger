package com.br.crud.trace.model.exception;

public class EmptyResultDataAccessException extends BusinessException{
    private static final long serialVersionUID = 1L;

    public EmptyResultDataAccessException(String mensagem) {
        super(mensagem);
    }
}
