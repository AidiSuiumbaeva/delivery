package kg.megacom.delivery.repositories;

import kg.megacom.delivery.models.entity.OrderHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderHistoryRep extends JpaRepository<OrderHistory,Long> {
}
