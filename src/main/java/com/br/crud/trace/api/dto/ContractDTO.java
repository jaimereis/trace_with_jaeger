package com.br.crud.trace.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class ContractDTO {

    @NotEmpty(message = "brandName cannot be null or empty")
    private String brandName;
    @NotEmpty(message = "companyCnpj cannot be null or empty")
    private String companyCnpj;
    @NotEmpty(message = "productType cannot be null or empty")
    private String productType;

}
