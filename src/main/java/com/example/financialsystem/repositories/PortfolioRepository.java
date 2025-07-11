package com.example.financialsystem.repositories;

import com.example.financialsystem.entities.Portfolio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PortfolioRepository extends JpaRepository<Portfolio, Long> { }
