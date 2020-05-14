package kg.megacom.delivery.models.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;
@Data
@Entity
@Table(name = "orderStatuses")
public class OrderStatus {
    @Id
    @GeneratedValue
    private Long orderStatusId;
    @JsonFormat(pattern = "dd.MM.yyyy")
    private Date startDate;
    @JsonFormat(pattern = "dd.MM.yyyy")
    private Date endDate;


    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @ManyToOne
    @JoinColumn(name = "status_id")
    private Statuses statuses;

    @OneToOne
    @JoinColumn(name = "order_id")
    private Order order;
}
