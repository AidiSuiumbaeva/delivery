package kg.megacom.delivery.services.impl;

import kg.megacom.delivery.mappers.RestaurantMapper;
import kg.megacom.delivery.models.dto.RestaurantDto;
import kg.megacom.delivery.models.entity.Restaurant;
import kg.megacom.delivery.repositories.RestaurantRep;
import kg.megacom.delivery.services.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantServiceImpl implements RestaurantService {

    @Autowired
    private RestaurantRep restaurantRep;
    @Override
    public RestaurantDto save(RestaurantDto restaurantDto) {
        Restaurant restaurant= RestaurantMapper.RESTOURANT_MAPPER.restaurantToRestaurantDto(restaurantDto);
        restaurant=restaurantRep.save(restaurant);
        restaurantDto=RestaurantMapper.RESTOURANT_MAPPER.restaurantDtoToRestaurant(restaurant);
        return restaurantDto;
    }

    @Override
    public RestaurantDto findById(Long id) {
        return RestaurantMapper.RESTOURANT_MAPPER
                .restaurantDtoToRestaurant(restaurantRep.findById(id).orElse(null));
    }

    @Override
    public List<RestaurantDto> getList() {
return RestaurantMapper.RESTOURANT_MAPPER.restaurantDtosToRestaurants(restaurantRep.findAll());


    }

    @Override
    public RestaurantDto delete(Long id) {

      RestaurantDto  restaurantDto=RestaurantMapper.RESTOURANT_MAPPER
                .restaurantDtoToRestaurant(restaurantRep.findById(id).orElse(null));
      restaurantDto.setActive(false);

        Restaurant restaurant=RestaurantMapper.RESTOURANT_MAPPER.restaurantToRestaurantDto(restaurantDto);
        restaurant=restaurantRep.save(restaurant);
        restaurantDto=RestaurantMapper.RESTOURANT_MAPPER.restaurantDtoToRestaurant(restaurant);

        return restaurantDto;
    }


}
