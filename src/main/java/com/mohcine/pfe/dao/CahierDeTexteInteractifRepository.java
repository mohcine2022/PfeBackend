package com.mohcine.pfe.dao;

import com.mohcine.pfe.model.CahierDeTexteInteractif;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CahierDeTexteInteractifRepository extends JpaRepository<CahierDeTexteInteractif,Long> {
    List<CahierDeTexteInteractif> findAllByTitreContainsOrDescriptionContains(String key, String key1);
}
