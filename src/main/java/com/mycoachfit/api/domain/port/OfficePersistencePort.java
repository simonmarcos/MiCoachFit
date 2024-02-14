package com.mycoachfit.api.domain.port;

import com.mycoachfit.api.domain.model.Client;
import com.mycoachfit.api.domain.model.Office;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface OfficePersistencePort {
    Office create(Office company);

    Office update(Office company);

    List<Office> getAll();

    Office findById(Long id);
}
