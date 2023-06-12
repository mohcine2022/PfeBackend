package com.mohcine.pfe.dao;

import com.mohcine.pfe.model.Conge;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CongeRepository extends JpaRepository<Conge,Long> {
    List<Conge> findAllByEnseignant_NomContainsOrEnseignant_PrenomContains(String key, String key1);
}
