package kg.megacom.delivery.mappers;

import kg.megacom.delivery.models.dto.PhoneDto;
import kg.megacom.delivery.models.dto.RestaurantDto;
import kg.megacom.delivery.models.entity.Phone;
import kg.megacom.delivery.models.entity.Restaurant;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface PhoneMapper {
    PhoneMapper PHONE_MAPPER= Mappers.getMapper(PhoneMapper.class);

    Phone phoneToPhoneDto(PhoneDto phoneDto);
    PhoneDto phoneDtoToPhone(Phone phone);

    List<Phone> phonesToPhoneDtos(List<PhoneDto> phoneDtos);
    List<PhoneDto> phoneDtosToPhones(List<Phone> phones);
}
