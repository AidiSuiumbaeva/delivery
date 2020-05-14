package kg.megacom.delivery.models.entity;

import kg.megacom.delivery.models.entity.Dish;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "price")
public class Price {
    @Id
    @GeneratedValue
    private Long id;
    private double price;
    private Date endDate;
    private Date startDate;
    @ManyToOne
    @JoinColumn(name = "dish_id")
    private Dish dish;

}
