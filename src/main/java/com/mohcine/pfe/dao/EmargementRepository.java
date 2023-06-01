package com.mohcine.pfe.dao;

import com.mohcine.pfe.model.Emargement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmargementRepository extends JpaRepository<Emargement,Long> {
}
