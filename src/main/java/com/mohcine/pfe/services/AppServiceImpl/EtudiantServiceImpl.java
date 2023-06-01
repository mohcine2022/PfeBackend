package com.mohcine.pfe.services.AppServiceImpl;

import com.mohcine.pfe.dao.EtudiantRepository;
import com.mohcine.pfe.model.Etudiant;
import com.mohcine.pfe.services.AppService.EtudiantService;
import org.springframework.stereotype.Service;

@Service
public class EtudiantServiceImpl implements EtudiantService {
    private final EtudiantRepository etudiantRepository;

    public EtudiantServiceImpl(EtudiantRepository etudiantRepository) {
        this.etudiantRepository = etudiantRepository;
    }
    @Override
    public Etudiant creerEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }
}
