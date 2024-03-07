package com.pragma.powerup_messengermicroservice.application.mapper;

import com.pragma.powerup_messengermicroservice.application.dto.request.OrderReadyMessageRequestDto;
import com.pragma.powerup_messengermicroservice.domain.model.OrderReadyMessage;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE, unmappedSourcePolicy =
        ReportingPolicy.IGNORE)
public interface IOrderReadyMessageRequestMapper {
    OrderReadyMessage orderReadyMessageRequestDtoToOrderReadyMessage(OrderReadyMessageRequestDto orderReadyMessageRequestDto);
}
