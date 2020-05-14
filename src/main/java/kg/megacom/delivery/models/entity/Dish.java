package kg.megacom.delivery.models.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "dish")
public class Dish {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private double size;
    private String photo;
    private double isActive;

    @ManyToOne
    @JoinColumn(name = "menu_id")
    private Menu menu;
}
