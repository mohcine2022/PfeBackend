package com.mohcine.pfe.controllers;

import com.mohcine.pfe.model.Conge;
import com.mohcine.pfe.model.Cours;
import com.mohcine.pfe.model.CreneauHoraire;
import com.mohcine.pfe.services.AppService.CoursService;
import com.mohcine.pfe.services.AppService.CreneauHoraireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/demo")
public class CreneauHoraireController {
    private final CreneauHoraireService creneauHoraireService;

    public CreneauHoraireController(CreneauHoraireService creneauHoraireService) {
        this.creneauHoraireService = creneauHoraireService;
    }

    @PostMapping("/creneauHoraire")
    CreneauHoraire creerCreneauHoraire(@RequestBody CreneauHoraire creneauHoraire) {
        return creneauHoraireService.creerCreneauHoraire(creneauHoraire);
    }
}