package com.mohcine.pfe.services.impl;

import com.mohcine.pfe.dao.UserRepository;
import com.mohcine.pfe.model.User;
import com.mohcine.pfe.services.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @Override
    public List<User> getAllUsers(String key) {
        return userRepository.findAllByFirstnameNotNull();
    }

}
