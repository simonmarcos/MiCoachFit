package com.mycoachfit.api.infrastructure.adapter.repository;

import com.mycoachfit.api.infrastructure.adapter.entity.PaymentHistoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentHistoryRepository extends JpaRepository<PaymentHistoryEntity, Long> {
}
