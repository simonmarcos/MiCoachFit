package com.mycoachfit.api.domain.port;

import com.mycoachfit.api.domain.model.Company;

import java.util.List;

public interface CompanyPersistencePort {
    Company create(Company company);

    Company update(Company company);

    List<Company> getAll();

    Company findById(Long id);
}
