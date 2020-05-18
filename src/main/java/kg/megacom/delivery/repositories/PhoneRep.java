package kg.megacom.delivery.repositories;

import kg.megacom.delivery.models.entity.Phone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhoneRep extends JpaRepository<Phone,Long> {
}
