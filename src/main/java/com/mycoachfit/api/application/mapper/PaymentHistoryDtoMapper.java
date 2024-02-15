package com.mycoachfit.api.application.mapper;

import com.mycoachfit.api.domain.model.PaymentHistory;
import com.mycoachfit.api.domain.model.dto.request.PaymentHistoryRequestDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PaymentHistoryDtoMapper {
    PaymentHistory toEntity(PaymentHistoryRequestDTO paymentHistoryRequestDTO);
}
