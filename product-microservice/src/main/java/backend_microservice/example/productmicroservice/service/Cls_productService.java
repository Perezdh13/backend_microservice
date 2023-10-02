package backend_microservice.example.productmicroservice.service;

import backend_microservice.example.productmicroservice.entity.Cls_productEntity;
import backend_microservice.example.productmicroservice.repository.Int_productRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Cls_productService {
    @Autowired
    private Int_productRepository productRepository;

    public void createProduct(Cls_productEntity productEntity){
        productRepository.save(productEntity);
    }

    public List<Cls_productEntity> readAllProducts(){
        List<Cls_productEntity> productEntities = new ArrayList<>(productRepository.findAll());
        return productEntities;
    }
}
