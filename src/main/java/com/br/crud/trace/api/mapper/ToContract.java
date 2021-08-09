package com.br.crud.trace.api.mapper;

import com.br.crud.trace.api.dto.ContractDTO;
import com.br.crud.trace.model.Contract;
import org.springframework.stereotype.Component;

@Component
public class ToContract {

    public Contract to(ContractDTO contractDTO){
        return Contract.builder()
                .brandName(contractDTO.getBrandName())
                .companyCnpj(contractDTO.getCompanyCnpj())
                .productType(contractDTO.getProductType())
                .build();
    }
}
