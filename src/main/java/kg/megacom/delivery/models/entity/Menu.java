package kg.megacom.delivery.models.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Data
@Entity
public class Menu {

    @Id
    @GeneratedValue
    private Long id;

    @OneToOne
    private Restourant restourant;
}
