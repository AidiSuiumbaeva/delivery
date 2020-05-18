package kg.megacom.delivery.models.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import kg.megacom.delivery.models.entity.Order;
import kg.megacom.delivery.models.entity.Restaurant;
import lombok.Data;

import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Date;

@Data
public class RestaurantOrderDto {
    private Long id;
    private boolean isReady;
    private Date startDate;
    private Date endDate;
    private Restaurant restaurant;
    private Order order;
}
