package com.mohcine.pfe.controllers;

import com.mohcine.pfe.model.CahierDeTexteInteractif;
import com.mohcine.pfe.model.Conge;
import com.mohcine.pfe.model.Enseignant;
import com.mohcine.pfe.model.User;
import com.mohcine.pfe.services.ResourceService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/resource")
@RequiredArgsConstructor
public class ResourceController {

    private final ResourceService resourceService;

    @GetMapping("/conges")
    List<Conge> listeDesConges(@RequestParam String key) {
        return resourceService.listeDesConges(key);
    }


    @PostMapping("/conges")
    Conge creerConge(@RequestBody Conge conge) {
        return this.resourceService.creerConge(conge);
    }

    @DeleteMapping("/conges/{id}")
    Boolean supprimerConge(@RequestBody Long id) {
        return this.resourceService.supprimerConge(id);
    }
    @GetMapping("/cahiers-de-texte")
    List<CahierDeTexteInteractif> listeDesCahierDeTextInteractifs(@RequestParam String key) {
        return resourceService.listeDesCahierDeTextInteractifs(key);
    }


    @PostMapping("/cahiers-de-texte")
    CahierDeTexteInteractif creerCahierDeTextInteractif(@RequestBody CahierDeTexteInteractif cdt) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication != null) {
            var user = (User) authentication.getPrincipal();
            cdt.setEnseignant((Enseignant) user.getPersonne());
        }
        cdt.setDateCreation(LocalDate.now());
        return this.resourceService.creerCahierDeTexteInteractif(cdt);
    }

    @DeleteMapping("/cahiers-de-texte/{id}")
    Boolean supprimerCahierDeTextInteractif(@RequestBody Long id) {
        return this.resourceService.supprimerCahierDeTexteInteractif(id);
    }

}
