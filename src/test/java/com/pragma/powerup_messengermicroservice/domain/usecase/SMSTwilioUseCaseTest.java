package com.pragma.powerup_messengermicroservice.domain.usecase;

import com.pragma.powerup_messengermicroservice.domain.model.OrderReadyMessage;
import com.pragma.powerup_messengermicroservice.domain.spi.ISMSTwilioClientPort;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class SMSTwilioUseCaseTest {
    @Mock
    private ISMSTwilioClientPort smsTwilioClientPort;
    
    @InjectMocks
    private SMSTwilioUseCase smsTwilioUseCase;
    
    @Test
    void sendOrderReadyMessage_callsTwilioClientPort(){
        OrderReadyMessage orderReadyMessage = new OrderReadyMessage();
        
        smsTwilioUseCase.sendOrderReadyMessage(orderReadyMessage);
        
        verify(smsTwilioClientPort, times(1)).sendOrderReadyMessage(orderReadyMessage);
    }
}