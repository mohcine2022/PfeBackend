package com.mohcine.pfe.services.impl;

import com.mohcine.pfe.dao.EmargementRepository;
import com.mohcine.pfe.model.Emargement;
import com.mohcine.pfe.services.EmargementService;
import org.springframework.stereotype.Service;

@Service
public class EmargementServiceImpl implements EmargementService {
    private final EmargementRepository emargementRepository;

    public EmargementServiceImpl(EmargementRepository emargementRepository) {
        this.emargementRepository = emargementRepository;
    }
    @Override
    public Emargement creerEmargement(Emargement emargement) {
        return emargementRepository.save(emargement);
    }
}
