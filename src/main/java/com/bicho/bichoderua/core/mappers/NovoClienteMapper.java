package com.bicho.bichoderua.core.mappers;

import org.springframework.stereotype.Component;

import com.bicho.bichoderua.core.dtos.NovoClienteRequest;
import com.bicho.bichoderua.core.models.Cliente;

@Component
public class NovoClienteMapper {
    public Cliente toModel(NovoClienteRequest novoClienteRequest){
        var cliente = new Cliente();
        //cliente.setId(novoClienteRequest.getId());
        cliente.setNome(novoClienteRequest.getNome());
        cliente.setEmail(novoClienteRequest.getEmail());

        return cliente;

    }
}
