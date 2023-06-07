package com.mohcine.pfe.controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api/dashboard")
public class DashboardController {
    @GetMapping
    public String getDashboardData() {
        // Logique pour récupérer les données du tableau de bord depuis la base de données ou une autre source
        return "Données du tableau de bord";
    }
}