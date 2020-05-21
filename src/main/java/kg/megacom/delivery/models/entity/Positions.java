package kg.megacom.delivery.models.entity;

import com.sun.javafx.beans.IDProperty;
import jdk.nashorn.internal.ir.CallNode;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "positions")
public class Positions {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "position_id")
    private Long id;
    private String name;
    private boolean isActive;
}
