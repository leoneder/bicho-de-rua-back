package com.bicho.bichoderua.core.mappers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bicho.bichoderua.core.dtos.NovoBichoRequest;
import com.bicho.bichoderua.core.models.Bicho;
import com.bicho.bichoderua.core.repositories.ClienteRepository;
import com.bicho.bichoderua.core.repositories.ImagemRepository;

@Component
public class NovoBichoMapper {
    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private ImagemRepository imagemRepository;

    public Bicho toModel(NovoBichoRequest novoBichoRequest){
        var bicho = new Bicho();
        bicho.setAnimal(novoBichoRequest.getAnimal());
        bicho.setCor(novoBichoRequest.getCor());
        bicho.setRaça(novoBichoRequest.getRaça());
        bicho.setPorte(novoBichoRequest.getPorte());
        bicho.setEndereço(novoBichoRequest.getEndereço());
        bicho.setDetalhes(novoBichoRequest.getDetalhes());
        bicho.setDataVisto(novoBichoRequest.getDataVisto());
        bicho.setDataCadastro(novoBichoRequest.getDataCadastro());
        
        bicho.setImagem(imagemRepository.findByIdOrElseThrow((novoBichoRequest.getImage_id())));
        bicho.setCliente(clienteRepository.findByIdOrElseThrow(novoBichoRequest.getCliente_id()));
        
        return bicho;
    }
}
