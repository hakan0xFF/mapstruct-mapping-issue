package org.mapstruct.example;

import org.junit.jupiter.api.Test;
import org.mapstruct.example.dto.CommitmentFeeDto;
import org.mapstruct.example.dto.FinancingProductDto;
import org.mapstruct.example.entity.CommitmentFee;
import org.mapstruct.example.entity.CommitmentFeeId;
import org.mapstruct.example.entity.FinancingProduct;
import org.mapstruct.example.entity.FinancingProductId;
import org.mapstruct.example.mapper.FinancingProductMapper;

import java.time.LocalDate;
import java.util.Collections;
import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;

class FinancingProductMapperTest {

  @Test
  void testMapDtoToEntity() {
    UUID financingProductId = UUID.randomUUID();
    UUID conditionedCommitmentFeeId = UUID.randomUUID();
    UUID unconditionedCommitmentFeeId = UUID.randomUUID();
    FinancingProductDto financingProductDto =
        new FinancingProductDto(
            financingProductId,
            Collections.singletonList(
                new CommitmentFeeDto(conditionedCommitmentFeeId, LocalDate.now(), 10f)),
            Collections.singletonList(
                new CommitmentFeeDto(unconditionedCommitmentFeeId, LocalDate.now(), 20f)));

    FinancingProduct financingProduct = FinancingProductMapper.MAPPER.toEntity(financingProductDto);

    assertThat(financingProduct.getId().getId()).isEqualTo(financingProductId);
  }

  @Test
  void testEntityDtoToDto() {
    UUID financingProductId = UUID.randomUUID();
    UUID conditionedCommitmentFeeId = UUID.randomUUID();
    UUID unconditionedCommitmentFeeId = UUID.randomUUID();
    FinancingProduct financingProduct =
        new FinancingProduct(
            new FinancingProductId(financingProductId),
            Collections.singletonList(
                new CommitmentFee(
                    new CommitmentFeeId(conditionedCommitmentFeeId), LocalDate.now(), 10f)),
            Collections.singletonList(
                new CommitmentFee(
                    new CommitmentFeeId(unconditionedCommitmentFeeId), LocalDate.now(), 20f)));

    FinancingProductDto financingProductDto = FinancingProductMapper.MAPPER.toDto(financingProduct);

    assertThat(financingProductDto.getId()).isEqualTo(financingProductId);
  }
}
