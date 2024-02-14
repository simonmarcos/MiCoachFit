package com.mycoachfit.api.infrastructure.adapter.repository;

import com.mycoachfit.api.infrastructure.adapter.entity.ExerciseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExerciseRepository extends JpaRepository<ExerciseEntity, Long> {
}
