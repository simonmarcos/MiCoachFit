package com.mycoachfit.api.infrastructure.adapter.repository;

import com.mycoachfit.api.domain.model.PersonalTrainer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonalTrainerRepository extends JpaRepository<PersonalTrainer, Long> {
}
