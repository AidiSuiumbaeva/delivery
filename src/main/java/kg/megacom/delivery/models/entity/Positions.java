package kg.megacom.delivery.models.entity;

import com.sun.javafx.beans.IDProperty;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "positions")
public class Positions {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private boolean isActive;
}
