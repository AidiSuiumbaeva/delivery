package kg.megacom.delivery.repositories;

import kg.megacom.delivery.models.entity.Dish;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DishRep extends JpaRepository<Dish,Long> {
}
