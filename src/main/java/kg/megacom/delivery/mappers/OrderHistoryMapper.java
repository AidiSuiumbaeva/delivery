package kg.megacom.delivery.mappers;

import kg.megacom.delivery.models.dto.OrderHistoryDto;
import kg.megacom.delivery.models.dto.RestaurantDto;
import kg.megacom.delivery.models.entity.OrderHistory;
import kg.megacom.delivery.models.entity.Restaurant;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface OrderHistoryMapper {
    OrderHistoryMapper ORDER_HISTORY_MAPPER= Mappers.getMapper(OrderHistoryMapper.class);

    OrderHistory orderHistoryToOrderHistoryDto(OrderHistoryDto orderHistoryDto);
    OrderHistoryDto orderHistoryDtoToOrderHistory(OrderHistory orderHistory);

    List<OrderHistory> orderHistoryToOrderHistoryDto(List<OrderHistoryDto> orderHistoryDtos);
    List<OrderHistoryDto> orderHistoryDtoToOrderHistory(List<OrderHistory> orderHistories);
}
