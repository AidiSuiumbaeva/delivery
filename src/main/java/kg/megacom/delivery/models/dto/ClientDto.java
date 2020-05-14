package kg.megacom.delivery.models.dto;

import lombok.Data;

@Data
public class ClientDto {

    private Long id;
    private String name;
    private String address;
    private int houseNo;
    private int flatNo;
    private String phone;

}
