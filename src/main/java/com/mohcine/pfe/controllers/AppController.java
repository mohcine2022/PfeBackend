package com.mohcine.pfe.controllers;


import com.mohcine.pfe.model.Conge;
import com.mohcine.pfe.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/demo")
public class AppController {

    private final AppService appService;

    @Autowired
    public AppController(AppService appService) {
        this.appService = appService;
    }
    
    @GetMapping(value = "/users")
    List<User> getAllUsers(@RequestParam String key) {
        return appService.getAllUsers(key);
    }

    @PostMapping("/conge")
    Conge creerConge(@RequestBody Conge conge) {
        return appService.creerConge(conge);
    }
}
