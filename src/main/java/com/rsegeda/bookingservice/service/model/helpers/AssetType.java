/*
    Created by Roman Segeda on 02 February 2020
*/

package com.rsegeda.bookingservice.service.model.helpers;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum AssetType {

  PURCHASE("Purchase"),
  SERVICE("Service");

  @Getter
  private final String type;
}
