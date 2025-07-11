package com.example.financialsystem.repositories;

import com.example.financialsystem.entities.FinancialAdvisor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FinancialAdvisorRepository extends JpaRepository<FinancialAdvisor, Long> { }
