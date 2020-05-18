package kg.megacom.delivery.mappers;

import kg.megacom.delivery.models.dto.RestaurantOrderDto;
import kg.megacom.delivery.models.entity.RestaurantOrder;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface RestaurantOrderMapper {
    RestaurantOrderMapper RESTAURANT_ORDER_MAPPER= Mappers.getMapper(RestaurantOrderMapper.class);

    RestaurantOrder restaurantOrderToRestaurantOrderDto(RestaurantOrderDto restaurantOrderDto);
    RestaurantOrderDto restaurantOrderDtoToRestaurantOrder(RestaurantOrder restaurantOrder);


    List<RestaurantOrder> restaurantOrdersToRestaurantOrderDtos(List<RestaurantOrderDto> restaurantOrderDtos);
    List<RestaurantOrderDto> restaurantOrderDtosToRestaurantOrders(List<RestaurantOrder> restaurantOrders);
}
