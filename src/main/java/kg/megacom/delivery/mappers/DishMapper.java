package kg.megacom.delivery.mappers;

import kg.megacom.delivery.models.dto.DishDto;
import kg.megacom.delivery.models.dto.RestaurantDto;
import kg.megacom.delivery.models.entity.Dish;
import kg.megacom.delivery.models.entity.Restaurant;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface DishMapper {

    DishMapper DISH_MAPPER= Mappers.getMapper(DishMapper.class);

    Dish dishToDishDto(DishDto dishDto);
    DishDto dishDtoToDish(Dish dish);

    List<Dish> dishToDishDto(List<DishDto> dishDtos);
    List<DishDto> dishDtoToDish(List<Dish> dishes);
}
