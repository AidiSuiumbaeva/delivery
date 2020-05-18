package kg.megacom.delivery.services;

import kg.megacom.delivery.models.dto.StatusesDto;
import kg.megacom.delivery.models.entity.Statuses;

import java.util.List;

public interface StatusesService {
    StatusesDto save(StatusesDto statusesDto);
    StatusesDto findById(Long id);
    List<StatusesDto> getList();
}
