package kg.megacorm.delivery.services.impl;

import kg.megacom.delivery.mappers.PriceMapper;
import kg.megacom.delivery.models.dto.PriceDto;
import kg.megacom.delivery.models.entity.Price;
import kg.megacom.delivery.repositories.PriceRep;
import kg.megacom.delivery.services.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PriceServiceImpl implements PriceService {
    @Autowired
    private PriceRep priceRep;

    @Override
    public PriceDto save(PriceDto priceDto) {
        Price price=PriceMapper.PRICE_MAPPER.priceToPriceDto(priceDto);
        price=priceRep.save(price);
        priceDto=PriceMapper.PRICE_MAPPER.priceDtoToPrice(price);
        return priceDto;
    }

    @Override
    public PriceDto get(Long id) {
        return PriceMapper.PRICE_MAPPER.
                priceDtoToPrice(priceRep.findById(id).orElse(null));
    }

    @Override
    public List<PriceDto> list() {
        return PriceMapper.PRICE_MAPPER.priceDtosToPrices(priceRep.findAll());
    }
}
