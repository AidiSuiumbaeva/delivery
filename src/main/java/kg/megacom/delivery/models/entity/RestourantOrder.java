package kg.megacom.delivery.models.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.javafx.beans.IDProperty;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "restourantOrders")
public class RestourantOrder {
    @Id
    @GeneratedValue
    private Long id;
    private boolean isReady;

    @JsonFormat(pattern = "dd.MM.yyyy")
    private Date startDate;
    @JsonFormat(pattern = "dd.MM.yyyy")
    private Date endDate;

    @OneToOne
    @JoinColumn(name = "restourant_id")
    private Restourant restourant;

    @OneToMany
    @JoinColumn(name = "order_id")
    private List<Order> orders;





}
