package com.mohcine.pfe.dao;

import com.mohcine.pfe.model.Presence;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PresenceRepository extends JpaRepository<Presence,Long> {
}
