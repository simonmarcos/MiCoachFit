package com.mycoachfit.api.application.usercases;

import com.mycoachfit.api.domain.model.Company;
import com.mycoachfit.api.domain.model.dto.request.CompanyRequestDTO;

import java.util.List;

public interface CompanyService {
    Company create(CompanyRequestDTO companyRequestDTO);

    Company update(Long id, CompanyRequestDTO company);

    List<Company> getAll();

    Company findById(Long id);
}
