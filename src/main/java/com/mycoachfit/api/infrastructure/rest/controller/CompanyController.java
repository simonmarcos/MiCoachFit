package com.mycoachfit.api.infrastructure.rest.controller;

import com.mycoachfit.api.application.usercases.CompanyService;
import com.mycoachfit.api.domain.model.Company;
import com.mycoachfit.api.domain.model.dto.request.CompanyRequestDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/companies")
public class CompanyController {

    private final CompanyService companyService;

    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @PostMapping()
    public ResponseEntity<Company> createCompany(@RequestBody CompanyRequestDTO companyRequestDTO) {
        Company companyResponse = companyService.create(companyRequestDTO);
        return ResponseEntity.ok(companyResponse);
    }
}
