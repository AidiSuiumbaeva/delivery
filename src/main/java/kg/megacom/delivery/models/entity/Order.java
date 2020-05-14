package kg.megacom.delivery.models.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Data
@Entity
@Table(name ="orders")
public class Order {
    @Id
    @GeneratedValue
    @Column(name = "order_id")
    private Long id;
    @Column(scale = 2)
    private double sum;
    @JsonFormat(pattern = "dd.MM.yyyy")
    private Date date;


    @OneToOne
    @JoinColumn(name = "status_id")
    private OrderDetails OrderDetailsId;

    @ManyToOne
    @JoinColumn(name="client_id")
    private Client clientId;



    /*	Заказ еды должен осуществляться через сайт или мобильное приложение.
    Далее заказ попадает оператору, который подтверждает заказ.
    Заказ начинает готовиться, устанавливается время готовки.
    После приготовления меняется статус заказа.
    Курьер видит, какие заказы готовы.
    После доставки меняется статус и фиксируется сумма, которая находится у курьера.
    Курьер должен будет в конце смены погасить всю сумму. Закрывается его смена.*/
}

