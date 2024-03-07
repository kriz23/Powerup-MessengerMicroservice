package com.pragma.powerup_messengermicroservice.domain.api;

import com.pragma.powerup_messengermicroservice.domain.model.OrderReadyMessage;

public interface ISMSTwilioServicePort {
    boolean sendOrderReadyMessage(OrderReadyMessage orderReadyMessage);
}
