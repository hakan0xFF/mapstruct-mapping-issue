package org.mapstruct.example.dto;

import java.util.List;
import java.util.UUID;

public final class FinancingProductDto {
  private final UUID id;
  private final List<CommitmentFeeDto> conditionedCommitmentFees;
  private final List<CommitmentFeeDto> unconditionedCommitmentFees;

  public FinancingProductDto(
      UUID id,
      List<CommitmentFeeDto> conditionedCommitmentFees,
      List<CommitmentFeeDto> unconditionedCommitmentFees) {
    this.id = id;
    this.conditionedCommitmentFees = conditionedCommitmentFees;
    this.unconditionedCommitmentFees = unconditionedCommitmentFees;
  }

  public UUID getId() {
    return this.id;
  }

  public List<CommitmentFeeDto> getConditionedCommitmentFees() {
    return this.conditionedCommitmentFees;
  }

  public List<CommitmentFeeDto> getUnconditionedCommitmentFees() {
    return this.unconditionedCommitmentFees;
  }
}
