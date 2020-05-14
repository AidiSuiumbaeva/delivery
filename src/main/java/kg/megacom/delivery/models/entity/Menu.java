package kg.megacom.delivery.models.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "menu")
public class Menu {

    @Id
    @GeneratedValue
    private Long id;

    @OneToOne
    private Restourant restourant;
}
