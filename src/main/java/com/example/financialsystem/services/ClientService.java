package com.example.financialsystem.services;

import com.example.financialsystem.entities.Client;
import com.example.financialsystem.repositories.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    private final ClientRepository repo;

    public ClientService(ClientRepository repo) {
        this.repo = repo;
    }

    public List<Client> findAll() { return repo.findAll(); }
    public Optional<Client> findById(Long id) { return repo.findById(id); }
    public Client save(Client client) { return repo.save(client); }
    public void delete(Long id) { repo.deleteById(id); }
}
