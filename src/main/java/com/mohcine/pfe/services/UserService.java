package com.mohcine.pfe.services;
import com.mohcine.pfe.model.User;
import java.util.List;
public interface UserService {
    List<User> getAllUsers(String key);
}
