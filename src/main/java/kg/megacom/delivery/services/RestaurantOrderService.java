package kg.megacom.delivery.services;

import kg.megacom.delivery.models.dto.RestaurantOrderDto;

import java.util.List;

public interface RestaurantOrderService {
    RestaurantOrderDto save(RestaurantOrderDto restaurantOrderDto);
    RestaurantOrderDto findById(Long id);
   List<RestaurantOrderDto> getList();
}
