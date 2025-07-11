package com.example.financialsystem.repositories;

import com.example.financialsystem.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> { }
