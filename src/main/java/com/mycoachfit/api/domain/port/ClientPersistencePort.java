package com.mycoachfit.api.domain.port;

import com.mycoachfit.api.domain.model.Client;

import java.util.List;


public interface ClientPersistencePort {
    Client create(Client company);

    Client update(Client company);

    List<Client> getAll();

    Client findById(Long id);
}
