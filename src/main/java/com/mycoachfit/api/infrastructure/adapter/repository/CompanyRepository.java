package com.mycoachfit.api.infrastructure.adapter.repository;

import com.mycoachfit.api.infrastructure.adapter.entity.CompanyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<CompanyEntity, Long> {
}
