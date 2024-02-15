package com.mycoachfit.api.application.service;

import com.mycoachfit.api.application.mapper.PaymentHistoryDtoMapper;
import com.mycoachfit.api.application.usercases.PaymentHistoryService;
import com.mycoachfit.api.domain.model.PaymentHistory;
import com.mycoachfit.api.domain.model.dto.request.PaymentHistoryRequestDTO;
import com.mycoachfit.api.domain.port.PaymentHistoryPersistencePort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentHistoryManagementService implements PaymentHistoryService {

    private final PaymentHistoryPersistencePort paymentHistoryPersistencePort;
    private final PaymentHistoryDtoMapper paymentHistoryDtoMapper;

    public PaymentHistoryManagementService(PaymentHistoryPersistencePort paymentHistoryPersistencePort, PaymentHistoryDtoMapper paymentHistoryDtoMapper) {
        this.paymentHistoryPersistencePort = paymentHistoryPersistencePort;
        this.paymentHistoryDtoMapper = paymentHistoryDtoMapper;
    }

    @Override
    public PaymentHistory create(PaymentHistoryRequestDTO paymentHistoryRequestDTO) {
        return paymentHistoryPersistencePort.create(paymentHistoryDtoMapper.toEntity(paymentHistoryRequestDTO));
    }

    @Override
    public PaymentHistory update(Long id, PaymentHistoryRequestDTO paymentHistoryRequestDTO) {
        findById(id);

        PaymentHistory paymentHistoryToSave = paymentHistoryDtoMapper.toEntity(paymentHistoryRequestDTO);
        paymentHistoryToSave.setId(id);

        return paymentHistoryPersistencePort.update(paymentHistoryToSave);
    }

    @Override
    public List<PaymentHistory> getAll() {
        return paymentHistoryPersistencePort.getAll();
    }

    @Override
    public PaymentHistory findById(Long id) {
        return paymentHistoryPersistencePort.findById(id).orElseThrow(() -> {
            throw new RuntimeException("No se encontró ningún historial de pago con el ID " + id);
        });
    }
}
