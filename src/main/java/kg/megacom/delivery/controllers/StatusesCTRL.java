package kg.megacom.delivery.controllers;

import io.swagger.annotations.Api;
import kg.megacom.delivery.models.dto.StatusesDto;
import kg.megacom.delivery.models.entity.Statuses;
import kg.megacom.delivery.services.StatusesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(value = "Restaurant Management",description = "Методы для управления статусом")
@RequestMapping(value = "/api/v1/statuses")
public class StatusesCTRL {
    @Autowired
    private StatusesService service;

    @PostMapping(value = "/save")
     StatusesDto saveStatus(@RequestBody StatusesDto statusesDto){
        return service.save(statusesDto);
    }

    @GetMapping(value = "/get/{id}")
    StatusesDto getStatus(Long id) {
        return service.findById(id);
    }

    @GetMapping(value = "/list")
    List<StatusesDto> getList(){
        return service.getList();
    }
}
