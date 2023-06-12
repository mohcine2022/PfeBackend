package com.mohcine.pfe.dao;

import com.mohcine.pfe.model.Inscription;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InscriptionRepository extends JpaRepository<Inscription,Long> {
    List<Inscription> findAllByFormation_TitreContains(String key);
}
