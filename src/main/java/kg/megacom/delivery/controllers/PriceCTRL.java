package kg.megacom.delivery.controllers;

import io.swagger.annotations.Api;
import kg.megacom.delivery.mappers.PriceMapper;
import kg.megacom.delivery.models.dto.PriceDto;
import kg.megacom.delivery.models.entity.Price;
import kg.megacom.delivery.services.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Api(value = "Price Management",description = "Методы для управления Рестораном")
@RequestMapping(value = "/api/v1/price")
public class PriceCTRL {

    @Autowired
    private PriceService service;

    @PostMapping(value = "/save")
    private PriceDto save(@RequestBody PriceDto priceDto){
       return service.save(priceDto);
    }

    @GetMapping(value = "/get/{id}")
    private PriceDto getPrice(Long id){
        return service.get(id);
    }

    @GetMapping(value = "/list")
    private List<PriceDto> getList(){
        return service.list();
    }
}
