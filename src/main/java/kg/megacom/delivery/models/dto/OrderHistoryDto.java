package kg.megacom.delivery.models.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import kg.megacom.delivery.enums.OrderStatus;
import kg.megacom.delivery.models.entity.Order;
import kg.megacom.delivery.models.entity.User;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
public class OrderHistoryDto {
    private Long orderStatusId;
    private Date startDate;
    private Date endDate;
    private User user;
    private OrderStatus status;
    private Order order;
}
