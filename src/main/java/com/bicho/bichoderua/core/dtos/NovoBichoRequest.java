package com.bicho.bichoderua.core.dtos;

public class NovoBichoRequest {
    
    
    private String animal;
    private String cor;
    private String raça;
    private String porte;
    private String endereço;
    private String detalhes;
    private String dataVisto;
    private String dataCadastro;
    private Long cliente_id;
    private Long image_id;

    public Long getImage_id() {
        return image_id;
    }
    public void setImage_id(Long image_id) {
        this.image_id = image_id;
    }
    public Long getCliente_id() {
        return cliente_id;
    }
    public void setCliente_id(Long clienteId) {
        this.cliente_id = clienteId;
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
