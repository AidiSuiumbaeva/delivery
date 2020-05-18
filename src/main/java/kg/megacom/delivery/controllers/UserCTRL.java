package kg.megacom.delivery.controllers;

import io.swagger.annotations.Api;
import kg.megacom.delivery.models.dto.UserDto;
import kg.megacom.delivery.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(value = "User Management",description = "Методы для управления ")
@RequestMapping(value = "/api/v1/user")
public class UserCTRL {

    @Autowired
    private UserService service;

    @PostMapping(value = "/save")
    UserDto saveUser(@RequestBody UserDto userDto){
        return service.save(userDto);
    }

    @PostMapping(value = "/delete")
    UserDto delete(Long id){
        return service.delete(id);
    }

    @GetMapping(value = "/get/{id}")
    UserDto findUser(Long id){
        return service.findById(id);
    }

    @GetMapping(value = "/getList")
    List<UserDto> getList(){
        return service.getList();
    }
}
