package com.mycoachfit.api.infrastructure.adapter;

import com.mycoachfit.api.domain.model.PaymentHistory;
import com.mycoachfit.api.domain.port.PaymentHistoryPersistencePort;
import com.mycoachfit.api.infrastructure.adapter.repository.PaymentHistoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentHistoryAdapter implements PaymentHistoryPersistencePort {


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
