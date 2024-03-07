package com.pragma.powerup_messengermicroservice.infrastructure.input.rest;

import com.pragma.powerup_messengermicroservice.application.dto.request.OrderReadyMessageRequestDto;
import com.pragma.powerup_messengermicroservice.application.handler.ISMSTwilioHandler;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "Order Rest Controller", description = "Rest controller for order operations")
@RestController
@RequestMapping("/api/v1/messenger")
@RequiredArgsConstructor
public class SMSTwilioRestController {
    private final ISMSTwilioHandler smsTwilioHandler;
    
    @Operation(summary = "Send order ready message")
    @ApiResponse(responseCode = "200", description = "Attempt to send the message done", content = @Content)
    @PostMapping("/order-ready")
    public ResponseEntity<Boolean> sendOrderReadyMessage(@RequestBody OrderReadyMessageRequestDto orderReadyMessageRequestDto){
        return ResponseEntity.ok(smsTwilioHandler.sendOrderReadyMessage(orderReadyMessageRequestDto));
    }
}
