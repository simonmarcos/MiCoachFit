package com.mycoachfit.api.domain.port;

import com.mycoachfit.api.domain.model.Company;

import java.util.List;
import java.util.Optional;

public interface CompanyPersistencePort {
    Company create(Company company);

    Company update(Company company);

    List<Company> getAll();

    Optional<Company> findById(Long id);
}
