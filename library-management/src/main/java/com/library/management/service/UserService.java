package com.library.management.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.library.management.entity.User;
import com.library.management.repository.UserRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public User saveUser(User user) {
        return userRepository.save(user);
    }
    public User loginUser(String email, String password) {

        User user = userRepository.findByEmail(email);

        if (user != null && user.getPassword().equals(password)) {
            return user;
        }

        return null;
    }
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}