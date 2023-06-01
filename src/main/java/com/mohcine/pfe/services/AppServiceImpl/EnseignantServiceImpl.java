package com.mohcine.pfe.services.AppServiceImpl;

import com.mohcine.pfe.dao.EnseignantRepository;
import com.mohcine.pfe.model.Enseignant;
import com.mohcine.pfe.services.AppService.EnseignantService;
import org.springframework.stereotype.Service;

@Service
public class EnseignantServiceImpl implements EnseignantService {
    private final EnseignantRepository enseignantRepository;

    public EnseignantServiceImpl(EnseignantRepository enseignantRepository) {
        this.enseignantRepository = enseignantRepository;
    }
    @Override
    public Enseignant creerEnseignant(Enseignant enseignant) {
        return enseignantRepository.save(enseignant);
    }
}
