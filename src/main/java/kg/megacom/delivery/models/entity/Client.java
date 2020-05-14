package kg.megacom.delivery.models.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "client")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "client_id")
   private Long id;
    @Column(nullable = false,length = 100)
   private String name;
    @Column(nullable = false,length = 100)
   private String address;
   private int houseNo;
   private String phone;

}
