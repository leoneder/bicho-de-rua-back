package com.bicho.bichoderua.core.models;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Bicho {
   
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   
   @Column(nullable = false)
   public String animal;

   @Column(nullable = false)
   public String cor;

   @Column(nullable = false)
   public String raça;

   @Column(nullable = false)
   public String porte;

   @Column(nullable = false)
   public String endereço;

   @Column(nullable = false)
   public String detalhes;

   @Column(nullable = false)
   public String dataVisto;

   @Column(nullable = false)
   public String dataCadastro;

   @ManyToOne(optional = true)
   public Cliente cliente;

   @OneToOne
   public Imagem imagem;

public Imagem getImagem() {
    return imagem;
}

public void setImagem(Imagem imagem) {
    this.imagem = imagem;
}

public Cliente getCliente() {
    return cliente;
}

public void setCliente(Cliente cliente) {
    this.cliente = cliente;
}

public Long getId() {
    return id;
}

public void setId(Long id) {
    this.id = id;
}

public String getAnimal() {
    return animal;
}

public void setAnimal(String animal) {
    this.animal = animal;
}

public String getCor() {
    return cor;
}

public void setCor(String cor) {
    this.cor = cor;
}

public String getRaça() {
    return raça;
}

public void setRaça(String raça) {
    this.raça = raça;
}

public String getPorte() {
    return porte;
}

public void setPorte(String porte) {
    this.porte = porte;
}

public String getEndereço() {
    return endereço;
}

public void setEndereço(String endereço) {
    this.endereço = endereço;
}

public String getDetalhes() {
    return detalhes;
}

public void setDetalhes(String detalhes) {
    this.detalhes = detalhes;
}

public String getDataVisto() {
    return dataVisto;
}

public void setDataVisto(String dataVisto) {
    this.dataVisto = dataVisto;
}

public String getDataCadastro() {
    return dataCadastro;
}

public void setDataCadastro(String dataCadastro) {
    this.dataCadastro = dataCadastro;
}



   
}
