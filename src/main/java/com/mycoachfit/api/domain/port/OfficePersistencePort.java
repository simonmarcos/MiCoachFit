package com.mycoachfit.api.domain.port;

import com.mycoachfit.api.domain.model.Office;

import java.util.List;

public interface OfficePersistencePort {
    Office create(Office company);

    Office update(Office company);

    List<Office> getAll();

    Office findById(Long id);
}
