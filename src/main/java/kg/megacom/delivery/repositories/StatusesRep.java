package kg.megacom.delivery.repositories;

import kg.megacom.delivery.models.entity.Statuses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatusesRep extends JpaRepository<Statuses,Long> {

}
