package org.mapstruct.example.entity;

import java.util.UUID;

public final class CommitmentFeeId extends EntityId {
  public CommitmentFeeId() {
    super();
  }

  public CommitmentFeeId(UUID id) {
    super(id);
  }
}
