package com.mohcine.pfe.controllers;
import com.mohcine.pfe.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/demo")
public class UserController{
    private final UserService userService;
    @Autowired
    public UserService(UserService userService) {
        this.userService = userService;
    }
    @GetMapping(value = "/users")
    List<User> getAllUsers(@RequestParam String key) {
        return userService.getAllUsers(key);
    }
}
