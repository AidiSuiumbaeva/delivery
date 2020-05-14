package kg.megacom.delivery.models.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import kg.megacom.delivery.enums.OrderStatus;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;
@Data
@Entity
@Table(name = "orderStatuses")
public class OrderHistory {
    @Id
    @GeneratedValue
    private Long orderStatusId;
    @JsonFormat(pattern = "dd.MM.yyyy")
    private Date startDate;
    @JsonFormat(pattern = "dd.MM.yyyy")
    private Date endDate;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private User user;

 @Enumerated(value = EnumType.STRING)
 private OrderStatus status;

    @ManyToOne (fetch = FetchType.EAGER)
    @JoinColumn(name = "order_id")
    private Order order;
}
