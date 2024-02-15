package com.mycoachfit.api.infrastructure.adapter;

import com.mycoachfit.api.domain.model.Client;
import com.mycoachfit.api.domain.port.ClientPersistencePort;
import com.mycoachfit.api.infrastructure.adapter.entity.ClientEntity;
import com.mycoachfit.api.infrastructure.adapter.mapper.ClientDboMapper;
import com.mycoachfit.api.infrastructure.adapter.repository.ClientRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Transactional
public class ClientAdapter implements ClientPersistencePort {

    private final ClientRepository clientRepository;
    private final ClientDboMapper clientDboMapper;

    public ClientAdapter(ClientRepository clientRepository, ClientDboMapper clientDboMapper) {
        this.clientRepository = clientRepository;
        this.clientDboMapper = clientDboMapper;
    }

    @Override
    public Client create(Client client) {
        ClientEntity clientEntitySaved = clientRepository.save(clientDboMapper.toDbo(client));
        return clientDboMapper.toDomain(clientEntitySaved);
    }

    @Override
    public Client update(Client client) {
        ClientEntity clientEntitySaved = clientRepository.save(clientDboMapper.toDbo(client));
        return clientDboMapper.toDomain(clientEntitySaved);
    }

    @Override
    public List<Client> getAll() {
        return clientRepository.findAll()
                .stream()
                .map(clientDboMapper::toDomain)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<Client> findById(Long id) {
        return clientRepository.findById(id).map(clientDboMapper::toDomain);
    }
}
