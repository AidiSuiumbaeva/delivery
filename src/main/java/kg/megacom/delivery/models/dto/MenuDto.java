package kg.megacom.delivery.models.dto;

import kg.megacom.delivery.models.entity.Restaurant;
import lombok.Data;

import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Data
public class MenuDto {
    private Long id;
    private Restaurant restaurant;
}
