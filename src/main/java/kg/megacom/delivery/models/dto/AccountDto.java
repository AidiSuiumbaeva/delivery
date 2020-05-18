package kg.megacom.delivery.models.dto;

import kg.megacom.delivery.models.entity.User;
import lombok.Data;

import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
@Data
public class AccountDto {
    private Long id;
    private User user;
    private String login;
    private String password;
}
