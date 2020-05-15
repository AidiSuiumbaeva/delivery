package kg.megacom.delivery.controllers;

import io.swagger.annotations.Api;
import kg.megacom.delivery.models.dto.RestaurantDto;
import kg.megacom.delivery.models.entity.Restaurant;
import kg.megacom.delivery.services.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(value = "Restaurant Management",description = "Методы для управления Рестораном")
@RequestMapping(value = "/api/v1/restaurant")
public class RestaurantCTRL {
    @Autowired
    private RestaurantService service;


    @PostMapping(value = "/save")
    RestaurantDto saveRestaurant(@RequestBody  RestaurantDto restaurantDto){
return service.save(restaurantDto);
    }

    @GetMapping(value = "/get/{id}")
RestaurantDto findRestaurant(Long id){
        return service.findById(id);
    }

    @GetMapping(value = "/list")
    List<RestaurantDto> getList(){
        return service.getList();
    }

    @PostMapping(value = "/delete/{id}")
    RestaurantDto delete(Long id){
        return service.delete(id);
    }


    /*

    create new restaurant
    update
    delete
    get by id
    get list of all restaurant
    */
}
