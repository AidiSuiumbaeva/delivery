package kg.megacom.delivery.models.dto;

import lombok.Data;

@Data
public class RestaurantDto {
    private Long id;
    private String name;
    private boolean isActive;

}
