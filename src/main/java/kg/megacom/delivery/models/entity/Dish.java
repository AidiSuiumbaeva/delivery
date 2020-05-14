package kg.megacom.delivery.models.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "dishes")
public class Dish {

    @Id
    @GeneratedValue
    @Column(name = "dish_id")
    private Long id;
    @Column(length = 100)
    private String name;
    private double size;
    private String photo;
    private boolean isActive;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "menu_id")
    private Menu menu;
}
