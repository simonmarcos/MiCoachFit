package com.mycoachfit.api.domain.port;

import com.mycoachfit.api.domain.model.Client;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public interface ClientPersistencePort {
    Client create(Client company);

    Client update(Client company);

    List<Client> getAll();

    Client findById(Long id);
}
