package com.mohcine.pfe.services.impl;
import com.mohcine.pfe.dao.SalleRepository;
import com.mohcine.pfe.model.Salle;
import com.mohcine.pfe.services.SalleService;
import org.springframework.stereotype.Service;

@Service
public class SalleServiceImpl implements SalleService {
    private final SalleRepository salleRepository;

    public SalleServiceImpl(SalleRepository salleRepository) {
        this.salleRepository = salleRepository;
    }
    @Override
    public Salle creerSalle(Salle salle) {
        return salleRepository.save(salle);
    }
}