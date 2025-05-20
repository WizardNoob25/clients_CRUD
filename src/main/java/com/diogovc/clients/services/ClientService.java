package com.diogovc.clients.services;


import com.diogovc.clients.dto.ClientDTO;
import com.diogovc.clients.entities.Client;
import com.diogovc.clients.repositories.ClientRepository;
import com.diogovc.clients.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository repository;

    @Transactional(readOnly = true)
    public ClientDTO findById(Long id) {
        Optional<Client> optional = repository.findById(id);
        Client client = optional.orElseThrow(() -> new ResourceNotFoundException("Cliente não encontrado"));
        ClientDTO clientDTO = new ClientDTO(client);
        return clientDTO;
    }

    
}
