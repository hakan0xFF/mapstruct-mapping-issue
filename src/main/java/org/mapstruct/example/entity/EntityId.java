package org.mapstruct.example.entity;

import java.util.UUID;

public abstract class EntityId {

  private final UUID id;

  protected EntityId() {
    this.id = UUID.randomUUID();
  }

  protected EntityId(UUID id) {
    this.id = id;
  }

  public UUID getId() {
    return id;
  }
}
