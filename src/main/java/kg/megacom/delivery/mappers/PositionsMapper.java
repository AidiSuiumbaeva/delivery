package kg.megacom.delivery.mappers;

import kg.megacom.delivery.models.dto.PositionsDto;
import kg.megacom.delivery.models.dto.RestaurantDto;
import kg.megacom.delivery.models.entity.Positions;
import kg.megacom.delivery.models.entity.Restaurant;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface PositionsMapper {

    PositionsMapper POSITIONS_MAPPER= Mappers.getMapper(PositionsMapper.class);

    Positions positionToPositionDto(PositionsDto positionDto);
    PositionsDto positionDtoToPosition(Positions position);

    List<Positions> positionsToPositionDtos(List<PositionsDto> positionsDtos);
    List<PositionsDto> positionDtosToPositions(List<Positions> positions);
}
