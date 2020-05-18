package kg.megacom.delivery.repositories;

import kg.megacom.delivery.models.entity.Positions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PositionsRep extends JpaRepository<Positions,Long> {
}
