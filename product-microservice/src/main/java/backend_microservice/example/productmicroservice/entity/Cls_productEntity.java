package backend_microservice.example.productmicroservice.entity;

import jakarta.persistence.*;
import lombok.*;




@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "product")
public class Cls_productEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String name;
    private String productDescription;
    private String unitPrices;
}
