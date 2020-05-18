package kg.megacom.delivery.mappers;

import kg.megacom.delivery.models.dto.RestaurantDto;
import kg.megacom.delivery.models.dto.StatusesDto;
import kg.megacom.delivery.models.entity.Restaurant;
import kg.megacom.delivery.models.entity.Statuses;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface StatusesMapper {
StatusesMapper STATUSES_MAPPER= Mappers.getMapper(StatusesMapper.class);


    Statuses statusesToStatusDto(StatusesDto statusDto);
    StatusesDto statusDtoToStatuses(Statuses statuses);

    List<Statuses> statusesToStatusesDtos(List<StatusesDto> statusesDtos);
    List<StatusesDto> statusesDtosToStatuses(List<Statuses> statuses);
}
