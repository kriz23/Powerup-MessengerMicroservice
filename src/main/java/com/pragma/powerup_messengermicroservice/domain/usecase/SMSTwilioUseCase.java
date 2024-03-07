package com.pragma.powerup_messengermicroservice.domain.usecase;

import com.pragma.powerup_messengermicroservice.domain.api.ISMSTwilioServicePort;
import com.pragma.powerup_messengermicroservice.domain.model.OrderReadyMessage;
import com.pragma.powerup_messengermicroservice.domain.spi.ISMSTwilioClientPort;

public class SMSTwilioUseCase implements ISMSTwilioServicePort {
    
    private final ISMSTwilioClientPort smsTwilioClientPort;
    
    public SMSTwilioUseCase(ISMSTwilioClientPort smsTwilioClientPort){
        this.smsTwilioClientPort = smsTwilioClientPort;
    }
    
    @Override
    public boolean sendOrderReadyMessage(OrderReadyMessage orderReadyMessage) {
        return smsTwilioClientPort.sendOrderReadyMessage(orderReadyMessage);
    }
}
