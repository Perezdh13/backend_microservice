package backendmicroservice.example.clientmicroservice.repository;

import backendmicroservice.example.clientmicroservice.entity.Cls_clientEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Int_clientRepository extends JpaRepository<Cls_clientEntity,String> {
}
