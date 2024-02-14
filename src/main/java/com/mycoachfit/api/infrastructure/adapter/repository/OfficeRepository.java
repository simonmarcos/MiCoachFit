package com.mycoachfit.api.infrastructure.adapter.repository;

import com.mycoachfit.api.infrastructure.adapter.entity.OfficeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OfficeRepository extends JpaRepository<OfficeEntity, Long> {
}
