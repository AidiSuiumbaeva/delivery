package kg.megacom.delivery.mappers;

import kg.megacom.delivery.models.dto.PriceDto;
import kg.megacom.delivery.models.dto.RestaurantDto;
import kg.megacom.delivery.models.entity.Price;
import kg.megacom.delivery.models.entity.Restaurant;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface PriceMapper {
    PriceMapper PRICE_MAPPER= Mappers.getMapper(PriceMapper.class);

    Price priceToPriceDto(PriceDto priceDto);
    PriceDto priceDtoToPrice(Price price);

    List<Price> pricesToPriceDtos(List<PriceDto> priceDtos);
    List<PriceDto> priceDtosToPrices(List<Price> prices);
}
