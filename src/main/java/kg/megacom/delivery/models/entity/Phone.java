package kg.megacom.delivery.models.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "phones")
public class Phone {
    @Id
    @GeneratedValue
    private Long id;

    private String phone;
    private boolean isActive;
    private boolean isMain;

    @ManyToOne
    @JoinColumn
    private User user;
}
