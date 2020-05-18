package kg.megacom.delivery.models.dto;

import lombok.Data;

@Data
public class PhoneDto {
    private Long id;
    private String phone;
    private boolean isActive;
    private boolean isMain;
}
