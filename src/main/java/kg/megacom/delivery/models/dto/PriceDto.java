package kg.megacom.delivery.models.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import kg.megacom.delivery.models.entity.Dish;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Date;

@Data
public class PriceDto {
    private Long id;
    private double price;
    private Date startDate;
    private Date endDate;
    private Dish dish;

}
