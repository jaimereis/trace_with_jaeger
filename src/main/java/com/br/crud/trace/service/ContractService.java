package com.br.crud.trace.service;

import com.br.crud.trace.model.Contract;
import com.br.crud.trace.model.exception.ContractNotFoundException;
import com.br.crud.trace.model.exception.EmptyResultDataAccessException;
import com.br.crud.trace.repository.ContractRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;

@AllArgsConstructor
@Service
public class ContractService {

    private final ContractRepository contractRepository;

    @Transactional
    public Contract save(Contract contract){
        return contractRepository.save(contract);
    }

    @Transactional
    public List<Contract> findAll(){
        return contractRepository.findAll();
    }

    @Transactional
    public void delete(Integer contractId) {
        try {
            contractRepository.deleteById(contractId);
        } catch (Exception e) {
            throw new EmptyResultDataAccessException("Não Localizado Id: " + contractId);
        }
    }

    public Contract findOrFail(Integer contractId) {
        return contractRepository.findById(contractId)
                .orElseThrow(() -> new ContractNotFoundException("Contrato não localizado " + contractId));
    }
}
