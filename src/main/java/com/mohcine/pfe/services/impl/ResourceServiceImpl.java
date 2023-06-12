package com.mohcine.pfe.services.impl;

import com.mohcine.pfe.dao.CahierDeTexteInteractifRepository;
import com.mohcine.pfe.dao.CongeRepository;
import com.mohcine.pfe.model.CahierDeTexteInteractif;
import com.mohcine.pfe.model.Conge;
import com.mohcine.pfe.services.ResourceService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ResourceServiceImpl implements ResourceService {

    private final CongeRepository congeRepository;
    private final CahierDeTexteInteractifRepository cahierDeTexteInteractifRepository;

    @Override
    public List<Conge> listeDesConges(String key) {
        return congeRepository.findAllByEnseignant_NomContainsOrEnseignant_PrenomContains(key, key);
    }

    @Override
    public Conge creerConge(Conge conge) {
        return congeRepository.save(conge);
    }

    @Override
    public Boolean supprimerConge(Long id) {
        try {
            congeRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public List<CahierDeTexteInteractif> listeDesCahierDeTextInteractifs(String key) {
        return cahierDeTexteInteractifRepository.findAllByTitreContainsOrDescriptionContains(key, key);
    }

    @Override
    public CahierDeTexteInteractif creerCahierDeTexteInteractif(CahierDeTexteInteractif cdt) {
        return cahierDeTexteInteractifRepository.save(cdt);
    }

    @Override
    public Boolean supprimerCahierDeTexteInteractif(Long id) {
        try {
            cahierDeTexteInteractifRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
