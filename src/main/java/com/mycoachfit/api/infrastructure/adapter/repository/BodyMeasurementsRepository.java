package com.mycoachfit.api.infrastructure.adapter.repository;

import com.mycoachfit.api.infrastructure.adapter.entity.BodyMeasurementsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BodyMeasurementsRepository extends JpaRepository<BodyMeasurementsEntity, Long> {
}
