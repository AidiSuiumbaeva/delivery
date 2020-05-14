package kg.megacom.delivery.models.entity;

import kg.megacom.delivery.models.entity.Dish;
import kg.megacom.delivery.models.entity.Order;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class OrderDetails {
    @Id
    @GeneratedValue
    private Long id;
    private Order order;
    private Dish dish;
    private int amount;
}
