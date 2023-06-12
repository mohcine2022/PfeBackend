package com.mohcine.pfe.services.impl;

import com.mohcine.pfe.dao.FormationRepository;
import com.mohcine.pfe.model.Formation;
import com.mohcine.pfe.services.FormationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class FormationServiceImpl implements FormationService {
    private final FormationRepository formationRepository;


    @Override
    public List<Formation> listeDesFormations(String key) {
        return formationRepository.findAllByTitreContainsOrDescriptionsContains(key, key);
    }

    @Override
    public Formation creerFormation(Formation formation) {
        return formationRepository.save(formation);
    }

    @Override
    public Boolean supprimerFormation(Long id) {
        try {
            formationRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
