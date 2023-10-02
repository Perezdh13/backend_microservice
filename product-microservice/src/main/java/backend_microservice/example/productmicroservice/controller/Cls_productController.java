package backend_microservice.example.productmicroservice.controller;

import backend_microservice.example.productmicroservice.entity.Cls_productEntity;
import backend_microservice.example.productmicroservice.repository.Int_productRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class Cls_productController {
    @Autowired
    private Int_productRepository productRepository;
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Cls_productEntity> getAllProducts(){
        return productRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void createProduct(@RequestBody Cls_productEntity productEntity){
        productRepository.save(productEntity);
    }
}
