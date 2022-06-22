package com.bicho.bichoderua.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bicho.bichoderua.core.models.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

    default Cliente findByIdOrElseThrow(Long id){
        return findById(id)
        .orElseThrow();
    }
    
}
