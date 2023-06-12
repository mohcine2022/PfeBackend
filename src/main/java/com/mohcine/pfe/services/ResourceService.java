package com.mohcine.pfe.services;


import com.mohcine.pfe.model.CahierDeTexteInteractif;
import com.mohcine.pfe.model.Conge;

import java.util.List;

public interface ResourceService {
    List<Conge> listeDesConges(String key);

    Conge creerConge(Conge conge);

    Boolean supprimerConge(Long id);

    List<CahierDeTexteInteractif> listeDesCahierDeTextInteractifs(String key);

    CahierDeTexteInteractif creerCahierDeTexteInteractif(CahierDeTexteInteractif cdt);

    Boolean supprimerCahierDeTexteInteractif(Long id);
}
