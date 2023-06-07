package com.mohcine.pfe.services.impl;

import com.mohcine.pfe.dao.EmploiDuTempsRepository;
import com.mohcine.pfe.model.Emploidutemps;
import com.mohcine.pfe.services.EmploiDuTempsService;
import org.springframework.stereotype.Service;

@Service
public class EmploiDuTempsServiceImpl implements EmploiDuTempsService {
    private final EmploiDuTempsRepository emploiDuTempsRepository;

    public EmploiDuTempsServiceImpl(EmploiDuTempsRepository emploiDuTempsRepository) {
        this.emploiDuTempsRepository = emploiDuTempsRepository;
    }
    @Override
    public Emploidutemps creerEmploiDuTemps(Emploidutemps emploiDuTemps) {
        return emploiDuTempsRepository.save(emploiDuTemps);
    }
}
