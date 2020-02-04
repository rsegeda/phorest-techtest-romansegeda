/*
    Created by Roman Segeda on 02 February 2020
*/

package com.rsegeda.bookingservice.controller.dto;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class PurchaseDTO {

  private String name;
  private BigDecimal price;

  @JsonProperty("appointment_id")
  private String appointmentId;

  @JsonProperty("loyalty_points")
  private Integer loyaltyPoints;
}
