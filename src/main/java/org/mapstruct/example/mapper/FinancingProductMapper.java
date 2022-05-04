package org.mapstruct.example.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.TargetType;
import org.mapstruct.example.dto.FinancingProductDto;
import org.mapstruct.example.entity.EntityId;
import org.mapstruct.example.entity.FinancingProduct;
import org.mapstruct.factory.Mappers;

import java.lang.reflect.InvocationTargetException;
import java.util.UUID;

@Mapper
public abstract class FinancingProductMapper {

  public static final FinancingProductMapper MAPPER =
      Mappers.getMapper(FinancingProductMapper.class);

  public abstract FinancingProduct toEntity(FinancingProductDto dto);

  public abstract FinancingProductDto toDto(FinancingProduct entity);

  protected <ID extends EntityId> ID mapEntityId(UUID id, @TargetType Class<ID> idClass)
      throws NoSuchMethodException, IllegalAccessException, InvocationTargetException,
          InstantiationException {
    return id != null ? idClass.getConstructor(UUID.class).newInstance(id) : null;
  }

  protected <ID extends EntityId> UUID mapEntityId(ID id) {
    return id != null ? id.getId() : null;
  }
}
