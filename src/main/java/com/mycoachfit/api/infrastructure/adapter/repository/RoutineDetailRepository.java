package com.mycoachfit.api.infrastructure.adapter.repository;

import com.mycoachfit.api.infrastructure.adapter.entity.RoutineDetailEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoutineDetailRepository extends JpaRepository<RoutineDetailEntity, Long> {
}
