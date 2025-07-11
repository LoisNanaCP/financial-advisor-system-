package com.example.financialsystem.entities;

import jakarta.persistence.*;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String email;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "financial_advisor_id", nullable = false)
    private FinancialAdvisor financialAdvisor;

    @OneToOne(mappedBy = "client", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private Portfolio portfolio;

    public Client() { }

    public Client(String name, String email, FinancialAdvisor financialAdvisor, Portfolio portfolio) {
        this.name = name;
        this.email = email;
        this.financialAdvisor = financialAdvisor;
        this.portfolio = portfolio;
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public FinancialAdvisor getFinancialAdvisor() { return financialAdvisor; }
    public Portfolio getPortfolio() { return portfolio; }

    public void setName(String name) { this.name = name; }
    public void setEmail(String email) { this.email = email; }
    public void setFinancialAdvisor(FinancialAdvisor financialAdvisor) {
        this.financialAdvisor = financialAdvisor;
    }
    public void setPortfolio(Portfolio portfolio) { this.portfolio = portfolio; }
}
