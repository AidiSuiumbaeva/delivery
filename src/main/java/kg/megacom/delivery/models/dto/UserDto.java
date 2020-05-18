package kg.megacom.delivery.models.dto;

import kg.megacom.delivery.models.entity.Account;
import kg.megacom.delivery.models.entity.Phone;
import kg.megacom.delivery.models.entity.Positions;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
public class UserDto {
    private Long id;
    private String name;
    private  boolean isActive;
    private Account account;
    private Positions positions;
    private List<Phone> phones;
}
