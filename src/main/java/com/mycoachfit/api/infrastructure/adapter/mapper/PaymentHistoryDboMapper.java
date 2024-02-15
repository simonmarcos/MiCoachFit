package com.mycoachfit.api.infrastructure.adapter.mapper;

import com.mycoachfit.api.domain.model.PaymentHistory;
import com.mycoachfit.api.infrastructure.adapter.entity.PaymentHistoryEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PaymentHistoryDboMapper {
    PaymentHistoryEntity toDbo(PaymentHistory paymentHistory);

    @InheritInverseConfiguration
    PaymentHistory toDomain(PaymentHistoryEntity paymentHistoryEntity);
}
