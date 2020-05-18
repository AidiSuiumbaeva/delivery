package kg.megacom.delivery.services.impl;

import kg.megacom.delivery.mappers.RestaurantOrderMapper;
import kg.megacom.delivery.models.dto.RestaurantOrderDto;
import kg.megacom.delivery.models.entity.RestaurantOrder;
import kg.megacom.delivery.repositories.RestaurantOrderRep;
import kg.megacom.delivery.services.RestaurantOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RestaurantOrderServiceImpl implements RestaurantOrderService {

    @Autowired
    private RestaurantOrderRep restaurantOrderRep;
    @Override
    public RestaurantOrderDto save(RestaurantOrderDto restaurantOrderDto) {
        RestaurantOrder restaurantOrder= RestaurantOrderMapper.RESTAURANT_ORDER_MAPPER.restaurantOrderToRestaurantOrderDto(restaurantOrderDto);
        restaurantOrder=restaurantOrderRep.save(restaurantOrder);
        restaurantOrderDto=RestaurantOrderMapper.RESTAURANT_ORDER_MAPPER.restaurantOrderDtoToRestaurantOrder(restaurantOrder);
        return restaurantOrderDto;
    }

    @Override
    public RestaurantOrderDto findById(Long id) {
        return RestaurantOrderMapper.RESTAURANT_ORDER_MAPPER.
                restaurantOrderDtoToRestaurantOrder(restaurantOrderRep.findById(id).orElse(null));

    }

    @Override
    public List<RestaurantOrderDto> getList() {

        return RestaurantOrderMapper.
                RESTAURANT_ORDER_MAPPER.
                restaurantOrderDtosToRestaurantOrders(restaurantOrderRep.findAll());
    }
}
