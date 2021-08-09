package com.br.crud.trace.api.controller;

import com.br.crud.trace.api.dto.ContractDTO;
import com.br.crud.trace.api.mapper.ToContract;
import com.br.crud.trace.model.Contract;
import com.br.crud.trace.service.ContractService;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/contracts")
public class ContractController {

    private final ContractService contractService;

    private final ToContract toContract;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Contract save(@RequestBody @Valid ContractDTO contractDTO){
        return contractService.save(toContract.to(contractDTO));
    }

    @GetMapping
    public List<Contract> findAll(){
        return contractService.findAll();
    }

    @GetMapping("/{contractId}")
    public Contract findContract(@PathVariable Integer contractId){
        return contractService.findOrFail(contractId);
    }

    @DeleteMapping("/{contractId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Integer contractId) {
        contractService.delete(contractId);
    }

    @PutMapping("/{contractId}")
    public Contract update(@PathVariable Integer contractId,
                            @RequestBody @Validated ContractDTO contractDTO) {
        Contract currentContract = contractService.findOrFail(contractId);

        BeanUtils.copyProperties(toContract.to(contractDTO), currentContract, "contractId");

        return contractService.save(currentContract);
    }


}
