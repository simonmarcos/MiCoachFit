package com.mycoachfit.api.domain.port;

import com.mycoachfit.api.domain.model.Company;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface CompanyPersistencePort {
    Company create(Company company);

    Company update(Company company);

    List<Company> getAll();

    Company findById(Long id);
}
