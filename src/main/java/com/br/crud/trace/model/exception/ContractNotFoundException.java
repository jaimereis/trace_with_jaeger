package com.br.crud.trace.model.exception;

public class ContractNotFoundException extends BusinessException{
    private static final long serialVersionUID = 1L;

    public ContractNotFoundException(String mensagem) {
        super(mensagem);
    }
}
