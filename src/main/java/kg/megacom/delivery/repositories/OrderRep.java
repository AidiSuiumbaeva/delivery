package kg.megacom.delivery.repositories;

import kg.megacom.delivery.models.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRep extends JpaRepository<Order,Long> {
}
