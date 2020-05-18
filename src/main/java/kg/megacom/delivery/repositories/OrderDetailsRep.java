package kg.megacom.delivery.repositories;

import kg.megacom.delivery.models.entity.OrderDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDetailsRep extends JpaRepository<OrderDetails,Long> {
}
