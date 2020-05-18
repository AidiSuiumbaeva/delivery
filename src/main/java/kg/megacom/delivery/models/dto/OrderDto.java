package kg.megacom.delivery.models.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import kg.megacom.delivery.models.entity.Client;
import kg.megacom.delivery.models.entity.OrderDetails;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.sql.Date;

@Data
public class OrderDto {
    private Long id;
    private double sum;
    private Date date;
    private OrderDetails OrderDetailsId;
    private Client clientId;

}
