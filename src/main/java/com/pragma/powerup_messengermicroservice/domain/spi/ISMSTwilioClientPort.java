package com.pragma.powerup_messengermicroservice.domain.spi;

import com.pragma.powerup_messengermicroservice.domain.model.OrderReadyMessage;

public interface ISMSTwilioClientPort {
    boolean sendOrderReadyMessage(OrderReadyMessage orderReadyMessage);
}
