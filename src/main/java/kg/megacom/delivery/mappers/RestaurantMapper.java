package kg.megacom.delivery.mappers;

import kg.megacom.delivery.models.dto.RestaurantDto;
import kg.megacom.delivery.models.entity.Restaurant;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface RestaurantMapper {

    RestaurantMapper RESTOURANT_MAPPER= Mappers.getMapper(RestaurantMapper.class);

    Restaurant restaurantToRestaurantDto(RestaurantDto restaurantDto);
    RestaurantDto restaurantDtoToRestaurant(Restaurant restaurant);


    List<Restaurant> restaurantToRestaurantDtos(List<RestaurantDto> restaurantDtos);
    List<RestaurantDto> restaurantDtosToRestaurants(List<Restaurant> restaurant);

}
