package com.example.financialsystem.services;

import com.example.financialsystem.entities.Portfolio;
import com.example.financialsystem.repositories.PortfolioRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PortfolioService {

    private final PortfolioRepository repo;

    public PortfolioService(PortfolioRepository repo) {
        this.repo = repo;
    }

    public List<Portfolio> findAll() {
        return repo.findAll();
    }

    public Optional<Portfolio> findById(Long id) {
        return repo.findById(id);
    }

    public Portfolio save(Portfolio portfolio) {
        return repo.save(portfolio);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}
