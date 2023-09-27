package backend_microservice.example.productmicroservice.repository;

import backend_microservice.example.productmicroservice.entity.Cls_productEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface Int_productRepository extends MongoRepository<Cls_productEntity, String> {
}
