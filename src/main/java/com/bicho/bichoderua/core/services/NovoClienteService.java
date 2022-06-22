package com.bicho.bichoderua.core.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bicho.bichoderua.core.dtos.NovoClienteRequest;

import com.bicho.bichoderua.core.mappers.NovoClienteMapper;
import com.bicho.bichoderua.core.repositories.ClienteRepository;




@Service
public class NovoClienteService {

    @Autowired
    private NovoClienteMapper novoClienteMapper;

    @Autowired
    private ClienteRepository clienteRepository;
    
    public void create(NovoClienteRequest novoClienteRequest){
        var clienteToCreate = novoClienteMapper.toModel(novoClienteRequest);
        var createCliente = clienteRepository.save(clienteToCreate);

    }
}
