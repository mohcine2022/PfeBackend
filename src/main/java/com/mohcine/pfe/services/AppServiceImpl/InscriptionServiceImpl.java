package com.mohcine.pfe.services.AppServiceImpl;

import com.mohcine.pfe.dao.InscriptionRepository;
import com.mohcine.pfe.model.Inscription;
import com.mohcine.pfe.services.AppService.InscriptionService;
import org.springframework.stereotype.Service;

@Service
public class InscriptionServiceImpl implements InscriptionService {
    private final InscriptionRepository inscriptionRepository;

    public InscriptionServiceImpl(InscriptionRepository inscriptionRepository) {
        this.inscriptionRepository = inscriptionRepository;
    }
    @Override
    public Inscription creerInscription(Inscription inscription) {
        return inscriptionRepository.save(inscription);
    }
}