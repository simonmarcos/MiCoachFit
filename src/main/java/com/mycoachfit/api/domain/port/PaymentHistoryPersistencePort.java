package com.mycoachfit.api.domain.port;

import com.mycoachfit.api.domain.model.PaymentHistory;

import java.util.List;
import java.util.Optional;

public interface PaymentHistoryPersistencePort {
    PaymentHistory create(PaymentHistory company);

    PaymentHistory update(PaymentHistory company);

    List<PaymentHistory> getAll();

    Optional<PaymentHistory> findById(Long id);
}
