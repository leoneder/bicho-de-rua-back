package com.bicho.bichoderua.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bicho.bichoderua.core.models.Imagem;

public interface ImagemRepository extends JpaRepository<Imagem, Long>{
    default Imagem findByIdOrElseThrow(Long id){
        return findById(id)
        .orElseThrow();
    }
}
