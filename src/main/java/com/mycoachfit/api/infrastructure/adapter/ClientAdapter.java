package com.mycoachfit.api.infrastructure.adapter;

import com.mycoachfit.api.domain.model.Client;
import com.mycoachfit.api.domain.model.Office;
import com.mycoachfit.api.domain.port.ClientPersistencePort;
import com.mycoachfit.api.domain.port.OfficePersistencePort;
import com.mycoachfit.api.infrastructure.adapter.repository.ClientRepository;
import com.mycoachfit.api.infrastructure.adapter.repository.OfficeRepository;

import java.util.List;

public class ClientAdapter implements ClientPersistencePort {

    private final ClientRepository clientRepository;

    public ClientAdapter(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public Client create(Client company) {
        return null;
    }

    @Override
    public Client update(Client company) {
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
