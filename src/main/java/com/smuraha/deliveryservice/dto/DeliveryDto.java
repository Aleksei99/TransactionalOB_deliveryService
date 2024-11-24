package com.smuraha.deliveryservice.dto;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class DeliveryDto {

    private String status;
    private UUID deliveryId;

}
