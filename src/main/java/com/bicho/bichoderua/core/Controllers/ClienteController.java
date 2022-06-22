package com.bicho.bichoderua.core.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.bicho.bichoderua.core.dtos.NovoClienteRequest;
import com.bicho.bichoderua.core.services.NovoClienteService;

@RestController
public class ClienteController {
    

    @Autowired
    private NovoClienteService novoClienteService;
    
    @GetMapping("/cliente")
    @ResponseStatus(code = HttpStatus.CREATED)
    //public String bi(@RequestParam(value = "name", defaultValue = "World") String name) {
        public String bi(@RequestBody NovoClienteRequest novoClienteRequest) {
        
        novoClienteService.create(novoClienteRequest);
        return novoClienteRequest.getNome();
	}
}
