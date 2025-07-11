package com.example.financialsystem.services;

import com.example.financialsystem.entities.FinancialAdvisor;
import com.example.financialsystem.repositories.FinancialAdvisorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FinancialAdvisorService {

    private final FinancialAdvisorRepository repo;

    public FinancialAdvisorService(FinancialAdvisorRepository repo) {
        this.repo = repo;
    }

    public List<FinancialAdvisor> findAll() { return repo.findAll(); }
    public Optional<FinancialAdvisor> findById(Long id) { return repo.findById(id); }
    public FinancialAdvisor save(FinancialAdvisor advisor) { return repo.save(advisor); }
    public void delete(Long id) { repo.deleteById(id); }
}
