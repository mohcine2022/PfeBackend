package com.mohcine.pfe.services.impl;
import com.mohcine.pfe.dao.CoursRepository;
import com.mohcine.pfe.dao.EnseignantRepository;
import com.mohcine.pfe.dao.EtudiantRepository;
import com.mohcine.pfe.services.DashboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service

public class DashboardServiceImpl implements DashboardService {
    @Autowired
    EtudiantRepository etudiantRepository;
    @Autowired
    CoursRepository coursRepository;
    @Autowired
    EnseignantRepository enseignantRepository;
    @Override
    public ResponseEntity<Map<String, Object>> getCount(){
        Map<String, Object> map = new HashMap<>();
        map.put("Etudiant", etudiantRepository.count());
        map.put("Cours", coursRepository.count());
        map.put("Enseignant", enseignantRepository.count());
        return new ResponseEntity<>(map, HttpStatus.OK);
    }
}
