package com.example.financialsystem.entities;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class FinancialAdvisor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @OneToMany(mappedBy = "financialAdvisor", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Client> clients;

    public FinancialAdvisor() { }

    public FinancialAdvisor(String name, List<Client> clients) {
        this.name = name;
        this.clients = clients;
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    public List<Client> getClients() { return clients; }

    public void setName(String name) { this.name = name; }
    public void setClients(List<Client> clients) { this.clients = clients; }
}
