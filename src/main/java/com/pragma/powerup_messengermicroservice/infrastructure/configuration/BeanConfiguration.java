package com.pragma.powerup_messengermicroservice.infrastructure.configuration;

import com.pragma.powerup_messengermicroservice.domain.api.ISMSTwilioServicePort;
import com.pragma.powerup_messengermicroservice.domain.spi.ISMSTwilioClientPort;
import com.pragma.powerup_messengermicroservice.domain.usecase.SMSTwilioUseCase;
import com.pragma.powerup_messengermicroservice.infrastructure.out.twilio.adapter.SMSTwilioClientAdapter;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class BeanConfiguration {
    
    @Bean
    public ISMSTwilioClientPort smsTwilioClientPort(){
        return new SMSTwilioClientAdapter();
    }
    
    @Bean
    public ISMSTwilioServicePort smsTwilioServicePort(){
        return new SMSTwilioUseCase(smsTwilioClientPort());
    }
}