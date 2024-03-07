package com.pragma.powerup_messengermicroservice.application.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class OrderReadyMessageRequestDto {
    private String clientPhone;
    private String restaurantPhone;
    private String restaurantName;
    private String orderPIN;
}
