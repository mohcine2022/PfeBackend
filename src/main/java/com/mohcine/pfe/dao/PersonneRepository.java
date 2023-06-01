package com.mohcine.pfe.dao;

import com.mohcine.pfe.model.Personne;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonneRepository extends JpaRepository<Personne,Long> {
}
