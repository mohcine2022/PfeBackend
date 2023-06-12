package com.mohcine.pfe.controllers;


import com.mohcine.pfe.model.*;
import com.mohcine.pfe.services.SettingService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/setting")
@RequiredArgsConstructor
public class SettingController {

    private final SettingService settingService;


    @GetMapping("/profils")
    Page<Profil> getProfils(Pageable pageable) {
        return settingService.getProfils(pageable);
    }
    @GetMapping("/liste-profils")
    List<Profil> getProfils() {
        return settingService.getListeProfils();
    }
    @GetMapping("/personnes")
    List<Personne> getPersonnes() {
        return settingService.getListePersonnes();
    }
    @PostMapping(value = "/profils")
    Profil enregistrerProfil(@RequestBody Profil profil) {
        return settingService.enregistrerProfil(profil);
    }

    @PostMapping(value = "/utilisateurs")
    User enregistrerUtilisateur(@RequestBody User user) {
        return settingService.enregistrerUtilisateur(user);
    }
    @GetMapping("/utilisateurs")
    List<User> getUtilisateurs() {
        return settingService.getUtlisateurs();
    }

    @DeleteMapping(value = "/utilisateurs/{id}")
    Boolean supprimerUtilisateur(@PathVariable Long id) {
        return settingService.supprimerUtilisateur(id);
    }

    @DeleteMapping(value = "/profils/{id}")
    Boolean supprimerProfil(@PathVariable Long id) {
        return settingService.supprimerProfil(id);
    }

    @PostMapping(value = "/salles")
    Salle enregistrerSalle(@RequestBody Salle salle) {
        return settingService.enregistrerSalle(salle);
    }
    @GetMapping("/salles")
    List<Salle> getSalles() {
        return settingService.getSalles();
    }

    @DeleteMapping(value = "/salles/{id}")
    Boolean supprimerSalle(@PathVariable Long id) {
        return settingService.supprimerSalle(id);
    }


    @PostMapping(value = "/enseignants")
    Enseignant enregistrerEnseignant(@RequestBody Enseignant enseignant) {
        return settingService.enregistrerEnseignant(enseignant);
    }
    @GetMapping("/enseignants")
    List<Enseignant> getEnseignants() {
        return settingService.getEnseignants();
    }

    @DeleteMapping(value = "/enseignants/{id}")
    Boolean supprimerEnseignant(@PathVariable Long id) {
        return settingService.supprimerEnseignant(id);
    }

    @PostMapping(value = "/courses")
    Cours enregistrerCours(@RequestBody Cours cours) {
        return settingService.enregistrerCours(cours);
    }
    @GetMapping("/courses")
    List<Cours> getCourses() {
        return settingService.getCourses();
    }

    @DeleteMapping(value = "/courses/{id}")
    Boolean supprimerCours(@PathVariable Long id) {
        return settingService.supprimerCours(id);
    }


    @PostMapping(value = "/responsables")
    ResponsableDeFormation enregistrerResponsable(@RequestBody ResponsableDeFormation responsable) {
        return settingService.enregistrerResponsable(responsable);
    }
    @GetMapping("/responsables")
    List<ResponsableDeFormation> getResponsablees() {
        return settingService.getResponsables();
    }

    @DeleteMapping(value = "/responsables/{id}")
    Boolean supprimerResponsable(@PathVariable Long id) {
        return settingService.supprimerResponsable(id);
    }


}
