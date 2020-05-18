package kg.megacom.delivery.services;

import kg.megacom.delivery.models.dto.UserDto;
import kg.megacom.delivery.models.entity.User;

import java.util.List;

public interface UserService {
    UserDto save(UserDto userDto);
    UserDto findById(Long id);
    List<UserDto> getList();
    UserDto delete(Long id);

}
