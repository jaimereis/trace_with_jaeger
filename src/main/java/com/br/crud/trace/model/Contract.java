package com.br.crud.trace.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Contract {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "contract_id")
    private Integer contractId;
    @NotEmpty(message = "brandName cannot be null or empty")
    private String brandName;
    @NotEmpty(message = "companyCnpj cannot be null or empty")
    private String companyCnpj;
    @NotEmpty(message = "productType cannot be null or empty")
    private String productType;


}
