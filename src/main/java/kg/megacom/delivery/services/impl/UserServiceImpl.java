package kg.megacom.delivery.services.impl;

import kg.megacom.delivery.mappers.UserMapper;
import kg.megacom.delivery.models.dto.UserDto;
import kg.megacom.delivery.models.entity.User;
import kg.megacom.delivery.repositories.UserRep;
import kg.megacom.delivery.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRep userRep;

    @Override
    public UserDto save(UserDto userDto) {
        User user= UserMapper.USER_MAPPER.userToUserDto(userDto);
        user=userRep.save(user);
        userDto=UserMapper.USER_MAPPER.userDtoToUser(user);
        return userDto;
    }

    @Override
    public UserDto findById(Long id) {

        return UserMapper.USER_MAPPER.userDtoToUser(userRep.findById(id).orElse(null));
    }

    @Override
    public List<UserDto> getList() {

        return UserMapper.USER_MAPPER.userDtosToUsers(userRep.findAll());
    }

    @Override
    public UserDto delete(Long id) {
        UserDto userDto=UserMapper.USER_MAPPER.userDtoToUser(userRep.findById(id).orElse(null));
        userDto.setActive(false);
        User user= UserMapper.USER_MAPPER.userToUserDto(userDto);
        user=userRep.save(user);
        userDto=UserMapper.USER_MAPPER.userDtoToUser(user);
        return userDto;
    }
}
