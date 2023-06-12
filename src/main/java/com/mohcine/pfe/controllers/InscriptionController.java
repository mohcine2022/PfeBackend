package com.mohcine.pfe.controllers;

import com.mohcine.pfe.model.Etudiant;
import com.mohcine.pfe.model.Inscription;
import com.mohcine.pfe.services.InscriptionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inscription")
@RequiredArgsConstructor
public class InscriptionController {

    private final InscriptionService inscriptionService;

    @GetMapping("/etudiants")
    List<Etudiant> listeDesEtudiants(@RequestParam String key) {
        return inscriptionService.listeDesEtudiants(key);
    }

    @PostMapping("/etudiants")
    Etudiant creerEtudiant(@RequestBody Etudiant etudiant) {
        return inscriptionService.creerEtudiant(etudiant);
    }

    @DeleteMapping("/etudiants/{id}")
    Boolean supprimerEtudiant(@PathVariable Long id) {
        return inscriptionService.supprimerEtudiant(id);
    }

    @GetMapping("/inscriptions")
    List<Inscription> listeDesInscriptions(@RequestParam String key) {
        return inscriptionService.listeDesInscriptions(key);
    }

    @PostMapping("/inscriptions")
    Inscription creerInscription(@RequestBody Inscription inscription) {
        return inscriptionService.creerInscription(inscription);
    }

    @DeleteMapping("/inscriptions/{id}")
    Boolean supprimerInscription(@PathVariable Long id) {
        return inscriptionService.supprimerInscription(id);
    }
}
