package com.dashboard.login.service;

import com.dashboard.login.entity.User;
import com.dashboard.login.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        System.out.println("user service called");
        this.userRepository = userRepository;
    }

    public User saveUser(User user) {
        System.out.println("InUser Service and Saving users");
        return userRepository.save(user);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}