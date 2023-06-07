package com.mohcine.pfe.controllers;
import com.mohcine.pfe.model.User;
import com.mohcine.pfe.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/demo")
@RequiredArgsConstructor
public class UserController{
    private final UserService userService;

    @GetMapping(value = "/users")
    List<User> getAllUsers(@RequestParam String key) {
        return userService.getAllUsers(key);
    }
}
