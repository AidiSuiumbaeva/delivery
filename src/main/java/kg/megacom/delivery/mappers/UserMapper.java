package kg.megacom.delivery.mappers;

import kg.megacom.delivery.models.dto.RestaurantDto;
import kg.megacom.delivery.models.dto.UserDto;
import kg.megacom.delivery.models.entity.Restaurant;
import kg.megacom.delivery.models.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface UserMapper {
    UserMapper USER_MAPPER= Mappers.getMapper(UserMapper.class);

    User userToUserDto(UserDto userDto);
    UserDto userDtoToUser(User user);

    List<User> usersToUserDtos(List<UserDto> userDtos);
    List<UserDto> userDtosToUsers(List<User> users);
}
