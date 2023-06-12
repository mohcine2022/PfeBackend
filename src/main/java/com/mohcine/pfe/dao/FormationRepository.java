package com.mohcine.pfe.dao;

import com.mohcine.pfe.model.Formation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FormationRepository extends JpaRepository<Formation, Long> {
    List<Formation> findAllByTitreContainsOrDescriptionsContains(String tittre, String description);
}
