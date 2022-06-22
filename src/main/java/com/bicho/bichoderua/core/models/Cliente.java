package com.bicho.bichoderua.core.models;


import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;




@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String email;

  //  @OneToMany(targetEntity=Bicho.class, fetch=FetchType.EAGER)
  //  @JoinColumn(name="cliente_id")
  //  private List<Bicho> bichos;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

//    public Bicho getBicho() {
//        return bicho;
//    }

//    public void setBicho(Bicho bicho) {
//        this.bicho = bicho;
//    }

    

}
