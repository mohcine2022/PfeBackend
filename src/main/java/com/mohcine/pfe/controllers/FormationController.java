package com.mohcine.pfe.controllers;


import com.mohcine.pfe.model.Formation;
import com.mohcine.pfe.services.FormationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/formation")
@RequiredArgsConstructor
public class FormationController {

    private final FormationService formationService;


    @GetMapping("/formations")
    List<Formation> listeDesFormations(@RequestParam String key) {
        return formationService.listeDesFormations(key);
    }


    @PostMapping("/formations")
    Formation creerFormation(@RequestBody Formation formation) {
        return this.formationService.creerFormation(formation);
    }


    @DeleteMapping("/formations/{id}")
    Boolean supprimerFormation(@RequestBody Long id) {
        return this.formationService.supprimerFormation(id);
    }

}
