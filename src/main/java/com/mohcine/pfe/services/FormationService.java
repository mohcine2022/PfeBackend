package com.mohcine.pfe.services;

import com.mohcine.pfe.model.Formation;

import java.util.List;

public interface FormationService {
    List<Formation> listeDesFormations(String key);

    Formation creerFormation(Formation formation);

    Boolean supprimerFormation(Long id);
}
