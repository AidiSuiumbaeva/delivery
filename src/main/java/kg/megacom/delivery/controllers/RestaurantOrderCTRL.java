package kg.megacom.delivery.controllers;

import io.swagger.annotations.Api;
import kg.megacom.delivery.models.dto.RestaurantOrderDto;
import kg.megacom.delivery.services.RestaurantOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(value = "RestaurantOrder Management",description = "Методы для управления ")
@RequestMapping(value = "/api/v1/restaurantOrder")
public class RestaurantOrderCTRL {

    @Autowired
    private RestaurantOrderService service;

    @PostMapping(value = "/save")
    private RestaurantOrderDto save(@RequestBody RestaurantOrderDto restaurantOrderDto){
        return service.save(restaurantOrderDto);
    }

    @GetMapping(value = "/get/{id}")
    private RestaurantOrderDto get(Long id){
        return service.findById(id);
    }

    @GetMapping(value = "/list")
    private List<RestaurantOrderDto> getList(){
        return service.getList();
    }
}
