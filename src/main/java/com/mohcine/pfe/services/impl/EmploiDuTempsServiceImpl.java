package com.mohcine.pfe.services.impl;

import com.mohcine.pfe.dao.EmploiDuTempsRepository;
import com.mohcine.pfe.model.EmploiDuTemps;
import com.mohcine.pfe.services.EmploiDuTempsService;
import org.springframework.stereotype.Service;

@Service
public class EmploiDuTempsServiceImpl implements EmploiDuTempsService {
    private final EmploiDuTempsRepository emploiDuTempsRepository;

    public EmploiDuTempsServiceImpl(EmploiDuTempsRepository emploiDuTempsRepository) {
        this.emploiDuTempsRepository = emploiDuTempsRepository;
    }
    @Override
    public EmploiDuTemps creerEmploiDuTemps(EmploiDuTemps emploiDuTemps) {
        return emploiDuTempsRepository.save(emploiDuTemps);
    }
}
