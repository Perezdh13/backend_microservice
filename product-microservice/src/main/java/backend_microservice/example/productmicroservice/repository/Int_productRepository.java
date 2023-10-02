package backend_microservice.example.productmicroservice.repository;

import backend_microservice.example.productmicroservice.entity.Cls_productEntity;

import org.springframework.data.jpa.repository.JpaRepository;


public interface Int_productRepository extends JpaRepository<Cls_productEntity,String> {
}
