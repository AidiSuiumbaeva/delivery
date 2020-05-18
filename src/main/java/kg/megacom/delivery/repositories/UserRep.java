package kg.megacom.delivery.repositories;

import kg.megacom.delivery.models.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRep extends JpaRepository<User,Long> {
}
