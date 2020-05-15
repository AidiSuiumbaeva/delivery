package kg.megacom.delivery.services;

import kg.megacom.delivery.models.dto.RestaurantDto;
import kg.megacom.delivery.models.entity.Restaurant;

import java.util.List;

public interface RestaurantService {
    RestaurantDto save(RestaurantDto restaurantDto);

    RestaurantDto findById(Long id);

    List<RestaurantDto> getList();

    RestaurantDto delete(Long id);

}
