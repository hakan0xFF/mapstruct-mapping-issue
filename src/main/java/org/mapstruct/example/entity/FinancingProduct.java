package org.mapstruct.example.entity;

import java.util.List;

public final class FinancingProduct {
  private final FinancingProductId id;
  private final List<CommitmentFee> conditionedCommitmentFees;
  private final List<CommitmentFee> unconditionedCommitmentFees;

  public FinancingProduct(
      FinancingProductId id,
      List<CommitmentFee> conditionedCommitmentFees,
      List<CommitmentFee> unconditionedCommitmentFees) {
    this.id = id;
    this.conditionedCommitmentFees = conditionedCommitmentFees;
    this.unconditionedCommitmentFees = unconditionedCommitmentFees;
  }

  public FinancingProductId getId() {
    return this.id;
  }

  public List<CommitmentFee> getConditionedCommitmentFees() {
    return this.conditionedCommitmentFees;
  }

  public List<CommitmentFee> getUnconditionedCommitmentFees() {
    return this.unconditionedCommitmentFees;
  }
}
