package com.mycoachfit.api.domain.port;

import com.mycoachfit.api.domain.model.Client;

import java.util.List;
import java.util.Optional;


public interface ClientPersistencePort {
    Client create(Client company);

    Client update(Client company);

    List<Client> getAll();

    Optional<Client> findById(Long id);
}
