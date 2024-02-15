package com.mycoachfit.api.domain.port;

import com.mycoachfit.api.domain.model.Office;

import java.util.List;
import java.util.Optional;

public interface OfficePersistencePort {
    Office create(Office company);

    Office update(Office company);

    List<Office> getAll();

    Optional<Office> findById(Long id);
}
