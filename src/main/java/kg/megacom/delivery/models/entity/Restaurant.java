package kg.megacom.delivery.models.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "restoraunts")
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "restourant_id")
    private Long id;
    private String name;
    private boolean isActive;

}
