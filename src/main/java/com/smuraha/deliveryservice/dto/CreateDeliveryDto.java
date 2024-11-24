package com.smuraha.deliveryservice.dto;

import lombok.Data;

import java.util.UUID;

@Data
public class CreateDeliveryDto {

    private UUID orderId;
    private String deliveryAddress;

}
