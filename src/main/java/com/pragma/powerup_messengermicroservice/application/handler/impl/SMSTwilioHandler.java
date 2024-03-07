package com.pragma.powerup_messengermicroservice.application.handler.impl;

import com.pragma.powerup_messengermicroservice.application.dto.request.OrderReadyMessageRequestDto;
import com.pragma.powerup_messengermicroservice.application.handler.ISMSTwilioHandler;
import com.pragma.powerup_messengermicroservice.application.mapper.IOrderReadyMessageRequestMapper;
import com.pragma.powerup_messengermicroservice.domain.api.ISMSTwilioServicePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SMSTwilioHandler implements ISMSTwilioHandler {
    private final ISMSTwilioServicePort smsTwilioServicePort;
    private final IOrderReadyMessageRequestMapper orderReadyMessageRequestMapper;
    @Override
    public boolean sendOrderReadyMessage(OrderReadyMessageRequestDto orderReadyMessageRequestDto) {
        return smsTwilioServicePort.sendOrderReadyMessage(
                orderReadyMessageRequestMapper.orderReadyMessageRequestDtoToOrderReadyMessage(orderReadyMessageRequestDto));
    }
}
