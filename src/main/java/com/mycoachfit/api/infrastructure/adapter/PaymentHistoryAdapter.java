package com.mycoachfit.api.infrastructure.adapter;

import com.mycoachfit.api.domain.model.PaymentHistory;
import com.mycoachfit.api.domain.port.PaymentHistoryPersistencePort;
import com.mycoachfit.api.infrastructure.adapter.entity.PaymentHistoryEntity;
import com.mycoachfit.api.infrastructure.adapter.mapper.PaymentHistoryDboMapper;
import com.mycoachfit.api.infrastructure.adapter.repository.PaymentHistoryRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Transactional
public class PaymentHistoryAdapter implements PaymentHistoryPersistencePort {

    private final PaymentHistoryRepository paymentHistoryRepository;
    private final PaymentHistoryDboMapper paymentHistoryDboMapper;

    public PaymentHistoryAdapter(PaymentHistoryRepository paymentHistoryRepository, PaymentHistoryDboMapper paymentHistoryDboMapper) {
        this.paymentHistoryRepository = paymentHistoryRepository;
        this.paymentHistoryDboMapper = paymentHistoryDboMapper;
    }

    @Override
    public PaymentHistory create(PaymentHistory paymentHistory) {
        PaymentHistoryEntity paymentHistoryEntitySaved = paymentHistoryRepository.save(paymentHistoryDboMapper.toDbo(paymentHistory));
        return paymentHistoryDboMapper.toDomain(paymentHistoryEntitySaved);
    }

    @Override
    public PaymentHistory update(PaymentHistory paymentHistory) {
        PaymentHistoryEntity paymentHistoryEntitySaved = paymentHistoryRepository.save(paymentHistoryDboMapper.toDbo(paymentHistory));
        return paymentHistoryDboMapper.toDomain(paymentHistoryEntitySaved);
    }

    @Override
    public List<PaymentHistory> getAll() {
        return paymentHistoryRepository.findAll()
                .stream()
                .map(paymentHistoryDboMapper::toDomain)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<PaymentHistory> findById(Long id) {
        return paymentHistoryRepository.findById(id).map(paymentHistoryDboMapper::toDomain);
    }

    // Puedes agregar métodos adicionales según tus necesidades
}
