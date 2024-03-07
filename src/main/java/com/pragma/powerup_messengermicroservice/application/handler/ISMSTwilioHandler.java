package com.pragma.powerup_messengermicroservice.application.handler;

import com.pragma.powerup_messengermicroservice.application.dto.request.OrderReadyMessageRequestDto;

public interface ISMSTwilioHandler {
    boolean sendOrderReadyMessage(OrderReadyMessageRequestDto orderReadyMessageRequestDto);
}
