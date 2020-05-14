package kg.megacom.delivery.models.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;
@Data
@Entity
public class OrderStatus {
    @Id
    @GeneratedValue
    private Long orderStatusId;
    private Date startDate;
    private Date endDate;

    @ManyToOne
    private User user;
    @ManyToOne
    private Statuses statuses;
}
