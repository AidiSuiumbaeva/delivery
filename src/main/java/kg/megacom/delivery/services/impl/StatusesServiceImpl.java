package kg.megacom.delivery.services.impl;

import kg.megacom.delivery.mappers.StatusesMapper;
import kg.megacom.delivery.models.dto.StatusesDto;
import kg.megacom.delivery.models.entity.Statuses;
import kg.megacom.delivery.repositories.StatusesRep;
import kg.megacom.delivery.services.StatusesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StatusesServiceImpl implements StatusesService {
    @Autowired
    private StatusesRep statusesRep;
    @Override
    public StatusesDto save(StatusesDto statusesDto) {
        Statuses statuses= StatusesMapper.STATUSES_MAPPER.statusesToStatusDto(statusesDto);
        statuses=statusesRep.save(statuses);
        statusesDto=StatusesMapper.STATUSES_MAPPER.statusDtoToStatuses(statuses);
        return statusesDto;
    }

    @Override
    public StatusesDto findById(Long id) {

        return StatusesMapper.
                STATUSES_MAPPER.statusDtoToStatuses(statusesRep.findById(id).orElse(null));
    }

    @Override
    public List<StatusesDto> getList() {
        return StatusesMapper.STATUSES_MAPPER.statusesDtosToStatuses(statusesRep.findAll());

    }
}
