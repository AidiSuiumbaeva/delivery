package kg.megacom.delivery.repositories;

import kg.megacom.delivery.models.entity.RestaurantOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantOrderRep extends JpaRepository<RestaurantOrder,Long> {
}
