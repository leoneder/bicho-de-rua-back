package com.bicho.bichoderua.core.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bicho.bichoderua.core.dtos.NovoBichoRequest;
import com.bicho.bichoderua.core.mappers.NovoBichoMapper;
import com.bicho.bichoderua.core.models.Bicho;
import com.bicho.bichoderua.core.repositories.BichoRepository;

@Service
public class NovoBichoService {
    @Autowired
    private BichoRepository bichoRepository;

    @Autowired
    private NovoBichoMapper novoBichoMapper;


    public void create(NovoBichoRequest novoBichoRequest){
        var bichoToCreate = novoBichoMapper.toModel(novoBichoRequest);
        var createBicho = bichoRepository.save(bichoToCreate);

    }

    public List<Bicho> findAll() {
       

        return  bichoRepository.findAll();
    
    }
}
