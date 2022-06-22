package com.bicho.bichoderua.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bicho.bichoderua.core.models.Bicho;

public interface BichoRepository extends JpaRepository<Bicho, Long> {
    default Bicho findByIdOrElseThrow(Long id){
        return findById(id)
        .orElseThrow();
    }
}
