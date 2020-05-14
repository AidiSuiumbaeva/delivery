package kg.megacom.delivery.models.entity;

import kg.megacom.delivery.models.entity.Positions;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private  boolean isActive;

    @OneToOne
    @JoinColumn(name = "account_id")
    private Account account;

    @OneToOne
    @JoinColumn(name = "position_id")
    private Positions positions;

@OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn
    private List<Phone> phones;

}
