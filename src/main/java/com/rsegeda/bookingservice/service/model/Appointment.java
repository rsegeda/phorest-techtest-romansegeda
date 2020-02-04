/*
    Created by Roman Segeda on 02 February 2020
*/

package com.rsegeda.bookingservice.service.model;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.domain.Persistable;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Builder
@Data
@Entity
@Document
public class Appointment implements Persistable<String> {

  @Id
  protected UUID id;

  @CreatedDate
  private Date createdDate;

  @LastModifiedDate
  private Date lastModifiedDate;

  @DBRef
  @NotNull
  private Client client;

  @NotNull
  private LocalDateTime startTime;

  @NotNull
  private LocalDateTime endTime;

  @DBRef
  private List<Asset> assets;

  private boolean persisted;

  @Override
  public String getId() {
    return id.toString();
  }

  @Override
  public boolean isNew() {
    return !persisted;
  }
}