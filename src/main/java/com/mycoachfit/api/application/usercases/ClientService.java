package com.mycoachfit.api.application.usercases;

import com.mycoachfit.api.domain.model.Client;
import com.mycoachfit.api.domain.model.dto.request.ClientRequestDTO;

import java.util.List;

public interface ClientService {
    Client create(ClientRequestDTO clientRequestDTO);

    Client update(ClientRequestDTO clientRequestDTO);

    List<Client> getAll();

    Client findById(Long id);
}
