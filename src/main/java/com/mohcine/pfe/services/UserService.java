package com.mohcine.pfe.services;
import com.mohcine.pfe.model.User;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.List;
public interface UserService {

    UserDetails loadUserByUsername(String username);
    List<User> getAllUsers(String key);
}
