package com.mohcine.pfe.dao;

import com.mohcine.pfe.model.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
    List<Etudiant> findAllByNomContainsOrPrenomContains(String key, String key1);
}
