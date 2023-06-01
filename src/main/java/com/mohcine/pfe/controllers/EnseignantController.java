package com.mohcine.pfe.controllers;

import com.mohcine.pfe.model.Enseignant;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/demo")
public class EnseignantController {
    private final EnseignantService enseignantService;
    public EnseignantController(EnseignantService enseignantService){
        this.enseignantService = enseignantService;
    }
}
    @PostMapping("/enseignant")
    Enseignant creerEnseignant(@RequestBody Enseignant enseignant) {
        return  enseignantService.creerEnseignant(enseignant);
}
