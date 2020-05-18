package kg.megacom.delivery.mappers;

import kg.megacom.delivery.models.dto.OrderDetailsDto;
import kg.megacom.delivery.models.dto.RestaurantDto;
import kg.megacom.delivery.models.entity.OrderDetails;
import kg.megacom.delivery.models.entity.Restaurant;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface OrderDetailsMapper {
    OrderDetailsMapper ORDER_DETAILS_MAPPER= Mappers.getMapper(OrderDetailsMapper.class);

    OrderDetails orderDetailsToOrderDetailsDto(OrderDetailsDto orderDetailsDto);
    OrderDetailsDto orderDetailsDtToOrderDetails(OrderDetails orderDetails);

    List<OrderDetails> orderDetailsToOrderDetailsDto(List<OrderDetailsDto> orderDetailsDtos);
    List<OrderDetailsDto> orderDetailsDtToOrderDetails(List<OrderDetails> orderDetails);
}
