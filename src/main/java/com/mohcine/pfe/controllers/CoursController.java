package com.mohcine.pfe.controllers;
import com.mohcine.pfe.model.Conge;
import com.mohcine.pfe.model.Cours;
import com.mohcine.pfe.services.AppService.CongeService;
import com.mohcine.pfe.services.AppService.CoursService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/demo")
public class CoursController {
    private final CoursService coursService;

    public CoursController(CoursService coursService) {
        this.coursService = coursService;
    }

    @PostMapping("/cours")
    Cours creerCours(@RequestBody Cours cours) {
        return CoursService.creerCours(cours);
    }
}
