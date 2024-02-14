package com.mycoachfit.api.application.usercases;

import com.mycoachfit.api.domain.model.Office;
import com.mycoachfit.api.domain.model.dto.request.OfficeRequestDTO;

import java.util.List;

public interface OfficeService {
    Office create(OfficeRequestDTO officeRequestDTO);

    Office update(OfficeRequestDTO officeRequestDTO);

    List<Office> getAll();

    Office findById(Long id);
}
