package org.mapstruct.example.entity;

import java.util.UUID;

public final class FinancingProductId extends EntityId {
  public FinancingProductId() {
    super();
  }

  public FinancingProductId(UUID id) {
    super(id);
  }
}
