package kg.megacom.delivery.services;

import kg.megacom.delivery.models.dto.PriceDto;
import kg.megacom.delivery.models.entity.Price;

import java.util.List;

public interface PriceService {
    PriceDto save(PriceDto priceDto);
    PriceDto get(Long id);
    List<PriceDto> list();
}
