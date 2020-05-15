package kg.megacom.delivery.mappers;

import kg.megacom.delivery.models.dto.ClientDto;
import kg.megacom.delivery.models.entity.Client;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ClientMapper {

    ClientMapper CLIENT_MAPPER= Mappers.getMapper(ClientMapper.class);

    Client clientDtoToClient(ClientDto clientDto);
    ClientDto clientToClientDto(Client client);


    List<Client> clientDtosToClients(List<ClientDto> clientDtos);
    List<ClientDto> clienstToClientDtos(List<Client> clients);
}
