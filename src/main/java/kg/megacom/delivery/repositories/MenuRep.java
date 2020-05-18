package kg.megacom.delivery.repositories;

import kg.megacom.delivery.models.entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuRep extends JpaRepository<Menu,Long> {
}
