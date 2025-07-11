package com.example.financialsystem.controllers;

import com.example.financialsystem.entities.Advisor;
import com.example.financialsystem.services.AdvisorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/advisors")
public class AdvisorController {

    private final AdvisorService service;

    public AdvisorController(AdvisorService service) {
        this.service = service;
    }

    @GetMapping
    public List<Advisor> getAllAdvisors() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Advisor> getAdvisorById(@PathVariable Long id) {
        Optional<Advisor> advisor = service.findById(id);
        return advisor.map(ResponseEntity::ok)
                      .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Advisor createAdvisor(@RequestBody Advisor advisor) {
        return service.save(advisor);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Advisor> updateAdvisor(@PathVariable Long id, @RequestBody Advisor updatedAdvisor) {
        Optional<Advisor> existing = service.findById(id);
        if (existing.isPresent()) {
            updatedAdvisor.setId(id);
            return ResponseEntity.ok(service.save(updatedAdvisor));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAdvisor(@PathVariable Long id) {
        Optional<Advisor> existing = service.findById(id);
        if (existing.isPresent()) {
            service.delete(id);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
