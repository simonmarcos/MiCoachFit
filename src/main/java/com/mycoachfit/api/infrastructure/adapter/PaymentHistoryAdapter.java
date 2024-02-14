package com.mycoachfit.api.infrastructure.adapter;

import com.mycoachfit.api.domain.model.PaymentHistory;
import com.mycoachfit.api.domain.port.PaymentHistoryPersistencePort;
import com.mycoachfit.api.infrastructure.adapter.repository.PaymentHistoryRepository;

import java.util.List;

public class PaymentHistoryAdapter implements PaymentHistoryPersistencePort {

    private final PaymentHistoryRepository paymentHistoryRepository;

    public PaymentHistoryAdapter(PaymentHistoryRepository paymentHistoryRepository) {
        this.paymentHistoryRepository = paymentHistoryRepository;
    }

    @Override
    public PaymentHistory create(PaymentHistory company) {
        return null;
    }

    @Override
    public PaymentHistory update(PaymentHistory company) {
        return null;
    }

    @Override
    public List<PaymentHistory> getAll() {
        return null;
    }

    @Override
    public PaymentHistory findById(Long id) {
        return null;
    }
}
