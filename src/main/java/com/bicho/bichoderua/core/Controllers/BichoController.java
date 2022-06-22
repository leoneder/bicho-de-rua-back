package com.bicho.bichoderua.core.Controllers;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.view.RedirectView;

import com.bicho.bichoderua.core.dtos.NovoBichoRequest;
import com.bicho.bichoderua.core.models.Bicho;
import com.bicho.bichoderua.core.repositories.BichoRepository;
import com.bicho.bichoderua.core.services.NovoBichoService;

@RestController
public class BichoController {
    @Autowired
    private NovoBichoService novoBichoService;

    @Autowired
    private BichoRepository bichoRepository;
    
    
    
    @CrossOrigin
    @GetMapping("/bicho")
    @ResponseStatus(code = HttpStatus.CREATED)
    public String bi(@RequestBody NovoBichoRequest novoBichoRequest) {    
        novoBichoService.create(novoBichoRequest);
        return novoBichoRequest.getAnimal();
	}
    @CrossOrigin
    @GetMapping(value = "/bichos",produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Bicho> findAll() {

        
     return novoBichoService.findAll();
     
     
     
    }

    

}
