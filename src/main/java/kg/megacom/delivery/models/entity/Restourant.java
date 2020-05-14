package kg.megacom.delivery.models.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "restoraunts")
public class Restourant {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private boolean isActive;




}
