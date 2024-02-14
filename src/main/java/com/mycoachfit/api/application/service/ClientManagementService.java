package com.mycoachfit.api.application.service;

import com.mycoachfit.api.application.usercases.ClientService;
import com.mycoachfit.api.domain.model.Client;
import com.mycoachfit.api.domain.model.dto.request.ClientRequestDTO;
import com.mycoachfit.api.domain.port.ClientPersistencePort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientManagementService implements ClientService {

    private final ClientPersistencePort clientPersistencePort;

    public ClientManagementService(ClientPersistencePort clientPersistencePort) {
        this.clientPersistencePort = clientPersistencePort;
    }

    @Override
    public Client create(ClientRequestDTO clientRequestDTO) {
        return null;
    }

    @Override
    public Client update(ClientRequestDTO clientRequestDTO) {
        return null;
    }

    @Override
    public List<Client> getAll() {
        return null;
    }

    @Override
    public Client findById(Long id) {
        return null;
    }
}
