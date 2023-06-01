package com.mohcine.pfe.controllers;

import com.mohcine.pfe.model.Emargement;
import com.mohcine.pfe.services.AppService.EmargementService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/demo")
public class EmargementController{
    private final EmargementService emargementService;

    public EmargementController(EmargementService emargementService) {
        this.emargementService = emargementService;
    }

    @PostMapping("/emargement")
    Emargement creerEmargement(@RequestBody Emargement emargement) {
        return emargementService.creerEmargement(emargement);
    }
}

