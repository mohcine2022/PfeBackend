package com.mohcine.pfe.controllers;
import com.mohcine.pfe.model.CahierDeTexteInteractif;
import com.mohcine.pfe.model.Conge;
import com.mohcine.pfe.services.AppService.CahierDeTexteInteractifService;
import com.mohcine.pfe.services.AppService.CongeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/demo")
public class CongeController{
    private final CongeService congeService;

    @Autowired
    public CongeController(CongeService congeService) {
        this.congeService = congeService;
    }
    @PostMapping("/conge")
    Conge creerConge(@RequestBody Conge conge) {
        return CongeService.creerConge(conge);
    }
}
