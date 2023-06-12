package com.mohcine.pfe.dao;

import com.mohcine.pfe.model.Seance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeanceRepository extends JpaRepository<Seance,Long> {
}
