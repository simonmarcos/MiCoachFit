package com.mycoachfit.api.application.usercases;

import com.mycoachfit.api.domain.model.PaymentHistory;
import com.mycoachfit.api.domain.model.dto.request.PaymentHistoryRequestDTO;

import java.util.List;

public interface PaymentHistoryService {
    PaymentHistory create(PaymentHistoryRequestDTO paymentHistoryRequestDTO);

    PaymentHistory update(Long id, PaymentHistoryRequestDTO paymentHistory);

    List<PaymentHistory> getAll();

    PaymentHistory findById(Long id);
}
