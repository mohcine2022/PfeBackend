package com.mohcine.pfe.services.AppServiceImpl;

import com.mohcine.pfe.dao.CongeRepository;
import com.mohcine.pfe.model.Conge;
import com.mohcine.pfe.services.AppService.CongeService;
import org.springframework.stereotype.Service;

@Service
public class CongeServiceImpl implements CongeService {
    private final CongeRepository congeRepository;

    public CongeServiceImpl(CongeRepository congeRepository) {
        this.congeRepository = congeRepository;
    }
    @Override
    public Conge creerConge(Conge conge) {
        return congeRepository.save(conge);
    }
}
