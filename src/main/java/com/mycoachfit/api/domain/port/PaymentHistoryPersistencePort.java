package com.mycoachfit.api.domain.port;

import com.mycoachfit.api.domain.model.Office;
import com.mycoachfit.api.domain.model.PaymentHistory;

import java.util.List;

public interface PaymentHistoryPersistencePort {
    PaymentHistory create(PaymentHistory company);

    PaymentHistory update(PaymentHistory company);

    List<PaymentHistory> getAll();

    PaymentHistory findById(Long id);
}
