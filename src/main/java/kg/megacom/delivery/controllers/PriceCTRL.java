package kg.megacom.delivery.controllers;

import io.swagger.annotations.Api;
import kg.megacom.delivery.mappers.PriceMapper;
import kg.megacom.delivery.models.dto.PriceDto;
import kg.megacom.delivery.models.entity.Price;
import kg.megacom.delivery.services.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@Api(value = "Price Management",description = "Методы для управления ")
@RequestMapping(value = "/api/v1/price")
public class PriceCTRL {

    @Autowired
    private PriceService service;

    @PostMapping(value = "/save")
     PriceDto save(@RequestBody PriceDto priceDto){
       return service.save(priceDto);
    }

    @GetMapping(value = "/get/{id}")
     PriceDto getPrice(Long id){
        return service.get(id);
    }

    @GetMapping(value = "/list")
     List<PriceDto> getList(){

        return service.list();
    }
}
