package com.library.management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.library.management.entity.User;
import com.library.management.service.UserService;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/users")
    public User registerUser(@RequestBody User user) {
        return userService.saveUser(user);
    }
    @PostMapping("/users/login")
    public User loginUser(@RequestParam String email, @RequestParam String password) {
        return userService.loginUser(email, password);
    }
    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
}