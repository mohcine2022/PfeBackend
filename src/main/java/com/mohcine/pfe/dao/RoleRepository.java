package com.mohcine.pfe.dao;

import com.mohcine.pfe.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Long> {
}
