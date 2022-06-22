package com.bicho.bichoderua;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.bicho.bichoderua.core.models.Cliente;
import com.bicho.bichoderua.core.models.Imagem;
import com.bicho.bichoderua.core.repositories.BichoRepository;
import com.bicho.bichoderua.core.repositories.ClienteRepository;
import com.bicho.bichoderua.core.repositories.ImagemRepository;

import org.springframework.boot.CommandLineRunner;

@SpringBootApplication

public class BichoDeRuaApplication implements CommandLineRunner{

	@Autowired
	private BichoRepository bichoRepository;

	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private ImagemRepository imagemRepository;

	public static void main(String[] args) {
		SpringApplication.run(BichoDeRuaApplication.class, args);

	}

	
	public void run(String... args) throws Exception {
		var cliente = new Cliente();
		//cliente.setId((long) 1);
		cliente.setEmail("leoneder@ymail.com");
		cliente.setNome("Leo");
		clienteRepository.save(cliente);
		
		var imagem = new Imagem();
		imagem.setUrl("https://www.petlove.com.br/dicas/wp-content/uploads/2020/10/Cachorro-culpa-Petlove.jpg");
		imagemRepository.save(imagem);


	}
}


//https://www.petlove.com.br/dicas/wp-content/uploads/2020/10/Cachorro-culpa-Petlove.jpg
