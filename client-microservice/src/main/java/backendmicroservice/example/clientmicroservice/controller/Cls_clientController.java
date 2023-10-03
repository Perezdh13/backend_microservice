package backendmicroservice.example.clientmicroservice.controller;

import backendmicroservice.example.clientmicroservice.entity.Cls_clientEntity;
import backendmicroservice.example.clientmicroservice.repository.Int_clientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/client")
public class Cls_clientController {
    @Autowired
    private Int_clientRepository clientRepository;
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Cls_clientEntity> getAllClients(){return clientRepository.findAll();}

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void createClient(@RequestBody Cls_clientEntity clientEntity){ clientRepository.save(clientEntity);}

}
