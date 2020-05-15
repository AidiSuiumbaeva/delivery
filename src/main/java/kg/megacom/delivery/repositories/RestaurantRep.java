package kg.megacom.delivery.repositories;

import kg.megacom.delivery.models.entity.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantRep extends JpaRepository<Restaurant,Long> {
}
