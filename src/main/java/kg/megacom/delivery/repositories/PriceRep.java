package kg.megacom.delivery.repositories;

import kg.megacom.delivery.models.entity.Price;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PriceRep extends JpaRepository<Price,Long> {
}
