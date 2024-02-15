package com.mycoachfit.api.infrastructure.rest.controller;

import com.mycoachfit.api.application.usercases.ClientService;
import com.mycoachfit.api.domain.model.Client;
import com.mycoachfit.api.domain.model.dto.request.ClientRequestDTO;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clients")
public class ClientController {

    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @PostMapping()
    public ResponseEntity<Client> createClient(@RequestBody @Valid ClientRequestDTO clientRequestDTO) {
        Client clientResponse = clientService.create(clientRequestDTO);
        return ResponseEntity.ok(clientResponse);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Client> updateClient(@PathVariable("id") Long id, @RequestBody ClientRequestDTO clientRequestDTO) {
        Client clientResponse = clientService.update(id, clientRequestDTO);
        return ResponseEntity.ok(clientResponse);
    }

    @GetMapping()
    public ResponseEntity<List<Client>> getAllClients() {
        List<Client> clientsResponse = clientService.getAll();
        return ResponseEntity.ok(clientsResponse);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Client> getClientById(@PathVariable("id") Long id) {
        Client clientResponse = clientService.findById(id);
        return ResponseEntity.ok(clientResponse);
    }
}
