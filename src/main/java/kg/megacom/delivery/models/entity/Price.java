package kg.megacom.delivery.models.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import kg.megacom.delivery.models.entity.Dish;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "prices")
public class Price {
    @Id
    @GeneratedValue
    @Column(name = "price_id")
    private Long id;
    @Column(scale = 2)
    private double price;
    @JsonFormat(pattern = "dd.MM.yyyy")
    private Date startDate;
    @JsonFormat(pattern = "dd.MM.yyyy")
    private Date endDate;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "dish_id")
    private Dish dish;

}
