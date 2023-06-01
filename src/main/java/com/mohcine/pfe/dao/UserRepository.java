package com.mohcine.pfe.dao;

import com.mohcine.pfe.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Integer> {
    Optional<User> findByEmail(String email);

    boolean existsByEmail(String email);

    List<User> findAllByFirstnameNotNull();
}