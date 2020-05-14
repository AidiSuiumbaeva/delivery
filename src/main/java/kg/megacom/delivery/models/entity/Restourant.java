package kg.megacom.delivery.models.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Data
@Entity
public class Restourant {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private boolean isActive;




}
