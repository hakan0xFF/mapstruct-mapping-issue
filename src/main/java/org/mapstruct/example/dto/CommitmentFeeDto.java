package org.mapstruct.example.dto;

import java.time.LocalDate;
import java.util.UUID;

public final class CommitmentFeeDto {
  private final UUID id;
  private final LocalDate dueDate;
  private final Float commitmentFee;

  public CommitmentFeeDto(UUID id, LocalDate dueDate, Float commitmentFee) {
    this.id = id;
    this.dueDate = dueDate;
    this.commitmentFee = commitmentFee;
  }

  public UUID getId() {
    return this.id;
  }

  public LocalDate getDueDate() {
    return this.dueDate;
  }

  public Float getCommitmentFee() {
    return this.commitmentFee;
  }
}
