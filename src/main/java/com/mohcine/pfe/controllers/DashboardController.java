package com.mohcine.pfe.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@RequestMapping(path = "/api/dashboard")
public interface DashboardController {
    @GetMapping(path = "/details")
    ResponseEntity<Map<String, Object>> getCount();
}
