package kg.megacom.delivery.mappers;

import kg.megacom.delivery.models.dto.AccountDto;
import kg.megacom.delivery.models.dto.RestaurantDto;
import kg.megacom.delivery.models.entity.Account;
import kg.megacom.delivery.models.entity.Restaurant;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface AccountMapper {
    AccountMapper ACCOUNT_MAPPER= Mappers.getMapper(AccountMapper.class);

    Account accountToAccountDto(AccountDto accoountDto);
    AccountDto accountDtoToAccount(Account account);

    List<Account> accountDtosToAccounts(List<AccountDto> accountDtos);
    List<AccountDto> accountsToAccountDtos(List<Account> account);

}
