package com.mohcine.pfe.services.impl;

import com.mohcine.pfe.dao.EtudiantRepository;
import com.mohcine.pfe.dao.InscriptionRepository;
import com.mohcine.pfe.model.Etudiant;
import com.mohcine.pfe.model.Inscription;
import com.mohcine.pfe.services.InscriptionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class InscriptionServiceImpl implements InscriptionService {
    private final InscriptionRepository inscriptionRepository;
    private final EtudiantRepository etudiantRepository;

    @Override
    public Inscription creerInscription(Inscription inscription) {
        return inscriptionRepository.save(inscription);
    }

    @Override
    public List<Etudiant> listeDesEtudiants(String key) {
        return etudiantRepository.findAllByNomContainsOrPrenomContains(key, key);
    }

    @Override
    public Etudiant creerEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    @Override
    public Boolean supprimerEtudiant(Long id) {
        try {
            etudiantRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public List<Inscription> listeDesInscriptions(String key) {
        return inscriptionRepository.findAllByFormation_TitreContains(key);
    }

    @Override
    public Boolean supprimerInscription(Long id) {
        try {
            inscriptionRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
