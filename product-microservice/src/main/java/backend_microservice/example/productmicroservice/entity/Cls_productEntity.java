package backend_microservice.example.productmicroservice.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.swing.*;
@Document(value = "product")
@Getter
@Setter
@NoArgsConstructor
public class Cls_productEntity {
    @Id
    private Spring id;
    private Spring name;
    private Spring productDescription;
    private Spring unitprices;
}
