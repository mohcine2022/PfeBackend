package com.mohcine.pfe.services;

import com.mohcine.pfe.model.Etudiant;
import com.mohcine.pfe.model.Inscription;

import java.util.List;

public interface InscriptionService {
    Inscription creerInscription(Inscription inscription);

    List<Etudiant> listeDesEtudiants(String key);

    Etudiant creerEtudiant(Etudiant etudiant);

    Boolean supprimerEtudiant(Long id);

    List<Inscription> listeDesInscriptions(String key);

    Boolean supprimerInscription(Long id);
}
