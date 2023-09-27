package backend_microservice.example.clientmicroservice.entity;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
//@Entity
//@Getter
//@Setter
//@NoArgsConstructor
public class Cls_client {
    //@Id
    private String id;
    private String name;
    private String surname;
    private String adress;
    private int age;
}
