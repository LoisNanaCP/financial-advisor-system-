package com.example.financialsystem.entities;

import jakarta.persistence.*;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;

    public Portfolio() { }

    public Portfolio(String name, Client client) {
        this.name = name;
        this.client = client;
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    public Client getClient() { return client; }

    public void setName(String name) { this.name = name; }
    public void setClient(Client client) { this.client = client; }
}
