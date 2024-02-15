package com.mycoachfit.api.application.service;

import com.mycoachfit.api.application.mapper.ClientDtoMapper;
import com.mycoachfit.api.application.usercases.ClientService;
import com.mycoachfit.api.domain.model.Client;
import com.mycoachfit.api.domain.model.dto.request.ClientRequestDTO;
import com.mycoachfit.api.domain.port.ClientPersistencePort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientManagementService implements ClientService {

    private final ClientPersistencePort clientPersistencePort;
    private final ClientDtoMapper clientDtoMapper;

    public ClientManagementService(ClientPersistencePort clientPersistencePort, ClientDtoMapper clientDtoMapper) {
        this.clientPersistencePort = clientPersistencePort;
        this.clientDtoMapper = clientDtoMapper;
    }

    @Override
    public Client create(ClientRequestDTO clientRequestDTO) {
        return clientPersistencePort.create(clientDtoMapper.toEntity(clientRequestDTO));
    }

    @Override
    public Client update(Long id, ClientRequestDTO clientRequestDTO) {
        findById(id);

        Client clientToSave = clientDtoMapper.toEntity(clientRequestDTO);
        clientToSave.setId(id);

        return clientPersistencePort.update(clientToSave);
    }

    @Override
    public List<Client> getAll() {
        return clientPersistencePort.getAll();
    }

    @Override
    public Client findById(Long id) {
        return clientPersistencePort.findById(id).orElseThrow(() -> {
            throw new RuntimeException("No se encontró ningún cliente con el ID " + id);
        });
    }
}
