package kg.megacom.delivery.models.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Phone {
    @Id
    @GeneratedValue
    private Long id;

    private String phone;
    private boolean isActive;

    @ManyToOne
    @JoinColumn
    private User user;
}
