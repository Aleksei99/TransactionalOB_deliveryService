package com.smuraha.deliveryservice.controller;

import com.smuraha.deliveryservice.dto.CreateDeliveryDto;
import com.smuraha.deliveryservice.dto.DeliveryDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@Slf4j
@RestController
@RequestMapping("/deliveries")
public class DeliveryController {

    @PostMapping()
    public DeliveryDto createDelivery(@RequestBody CreateDeliveryDto createDeliveryDto) {
        log.info("Getting delivery request << {}", createDeliveryDto);

        return DeliveryDto.builder()
                .status("success")
                .deliveryId(UUID.randomUUID())
                .build();
    }

}
