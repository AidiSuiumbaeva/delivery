package kg.megacom.delivery.mappers;

import kg.megacom.delivery.models.dto.MenuDto;
import kg.megacom.delivery.models.dto.RestaurantDto;
import kg.megacom.delivery.models.entity.Menu;
import kg.megacom.delivery.models.entity.Restaurant;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface MenuMapper {
    MenuMapper MENU_MAPPER= Mappers.getMapper(MenuMapper.class);

    Menu menuToMenuDto(MenuDto menuDto);
    MenuDto menuDtoToMenu(Menu menu);

    List<Menu> menuToMenuDto(List<MenuDto> menuDtos);
    List<MenuDto> menuDtoToMenu(List<Menu> menus);
}
