package kg.megacom.delivery.models.dto;

import kg.megacom.delivery.models.entity.Menu;
import lombok.Data;


@Data
public class DishDto {
    private Long id;
    private String name;
    private double size;
    private String photo;
    private boolean isActive;
    private Menu menu;
}
