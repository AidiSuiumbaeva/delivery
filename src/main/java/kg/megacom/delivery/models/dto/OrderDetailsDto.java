package kg.megacom.delivery.models.dto;

import kg.megacom.delivery.models.entity.Dish;
import lombok.Data;

import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import java.util.List;

@Data
public class OrderDetailsDto {
    private Long id;
    private List<Dish> dishes;
    private int amount;
}
