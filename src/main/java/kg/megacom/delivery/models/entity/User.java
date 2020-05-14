package kg.megacom.delivery.models.entity;

import kg.megacom.delivery.models.entity.Positions;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private  boolean isActive;

    @ManyToOne
    @JoinColumn(name = "position_id")
    private Positions positions;



}
