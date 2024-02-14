package com.mycoachfit.api.infrastructure.adapter.repository;

import com.mycoachfit.api.domain.model.PersonalTrainer;
import com.mycoachfit.api.infrastructure.adapter.entity.PersonalTrainerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonalTrainerRepository extends JpaRepository<PersonalTrainerEntity, Long> {
}
