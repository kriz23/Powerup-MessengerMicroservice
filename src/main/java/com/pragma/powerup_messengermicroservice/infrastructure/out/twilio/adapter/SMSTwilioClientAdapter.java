package com.pragma.powerup_messengermicroservice.infrastructure.out.twilio.adapter;

import com.pragma.powerup_messengermicroservice.domain.model.OrderReadyMessage;
import com.pragma.powerup_messengermicroservice.domain.spi.ISMSTwilioClientPort;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;

@RequiredArgsConstructor
public class SMSTwilioClientAdapter implements ISMSTwilioClientPort {
    
    @Value("${ACCOUNT_SID}")
    private String ACCOUNT_SID;
    
    @Value("${AUTH_TOKEN}")
    private String AUTH_TOKEN;
    
    
    @Override
    public boolean sendOrderReadyMessage(OrderReadyMessage orderReadyMessage) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message message = Message.creator(
                new PhoneNumber(orderReadyMessage.getClientPhone()),
                new PhoneNumber(orderReadyMessage.getRestaurantPhone()),
                "Your order in " + orderReadyMessage.getRestaurantName() + " is ready! Use the code " + orderReadyMessage.getOrderPIN() + " to pick it up."
                       ).create();
        return message.getStatus() != null;
    }
}
