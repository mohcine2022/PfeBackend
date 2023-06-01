package com.mohcine.pfe.controllers;
import com.mohcine.pfe.services.AppService.EmploiDuTempsService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/demo")
public class EmploiDuTempsController {
    private final EmploiDuTempsService emploiDuTempsService;

    public EmploiDuTempsController(EmploiDuTempsService emploiDuTempsService) {
        this.emploiDuTempsService = emploiDuTempsService;
    }

    @PostMapping("/emploiDuTemps")
    EmploiDuTemps creerEmploiDuTemps(@RequestBody EmploiDuTemps emploiDuTemps) {
        return emploiDuTempsService.creerEmploiDuTemps(emploiDuTemps);
    }
}
