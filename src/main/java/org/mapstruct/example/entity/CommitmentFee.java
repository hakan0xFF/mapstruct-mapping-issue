package org.mapstruct.example.entity;

import java.time.LocalDate;

public final class CommitmentFee {
  private final CommitmentFeeId id;
  private final LocalDate dueDate;
  private final Float fee;

  public CommitmentFee(CommitmentFeeId id, LocalDate dueDate, Float fee) {
    this.id = id;
    this.dueDate = dueDate;
    this.fee = fee;
  }

  public CommitmentFeeId getId() {
    return this.id;
  }

  public LocalDate getDueDate() {
    return this.dueDate;
  }

  public Float getFee() {
    return this.fee;
  }
}
