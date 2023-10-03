package backendmicroservice.example.clientmicroservice.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "clients")
public class Cls_clientEntity {
    @Id
    @GeneratedValue(strategy =  GenerationType.UUID)
    private String id;
    private String name;
    private String email;
    private String password;
}
