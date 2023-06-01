package com.mohcine.pfe.controllers;
import com.mohcine.pfe.model.CahierDeTexteInteractif;
import com.mohcine.pfe.services.AppService.CahierDeTexteInteractifService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/demo")
public class CahierDeTexteInteractifController{
    private final CahierDeTexteInteractifService cahierDeTexteInteractifService;

    @Autowired
    public CahierDeTexteInteractifController(CahierDeTexteInteractifService cahierDeTexteInteractifService) {
        this.cahierDeTexteInteractifService = cahierDeTexteInteractifService;
    }
    @PostMapping("/cahierDeTexteInteractif")
    CahierDeTexteInteractif creercahierDeTexteInteractif(@RequestBody CahierDeTexteInteractif cahierDeTexteInteractif) {
        return cahierDeTexteInteractifService.creerCahierDeTexteInteractif(cahierDeTexteInteractif);
    }
}
