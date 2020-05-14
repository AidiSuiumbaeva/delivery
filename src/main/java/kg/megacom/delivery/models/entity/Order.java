package kg.megacom.delivery.models.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Data
@Entity
@Table(name ="orders")
public class Order {
    @Id
    @GeneratedValue
    private Long id;
    private double sum;
    @JsonFormat(pattern = "HH.mm")
    private Date start;
    @JsonFormat(pattern = "HH.mm")
    private Date end;

    @OneToMany
    @JoinColumn(name = "status_id")
    private OrderStatus statusId;

    @OneToOne
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

