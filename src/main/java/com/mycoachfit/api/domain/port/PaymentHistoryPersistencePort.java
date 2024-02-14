package com.mycoachfit.api.domain.port;

import com.mycoachfit.api.domain.model.Office;
import com.mycoachfit.api.domain.model.PaymentHistory;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface PaymentHistoryPersistencePort {
    PaymentHistory create(PaymentHistory company);

    PaymentHistory update(PaymentHistory company);

    List<PaymentHistory> getAll();

    PaymentHistory findById(Long id);
}
