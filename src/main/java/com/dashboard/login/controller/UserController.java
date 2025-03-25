package com.dashboard.login.controller;

import com.dashboard.login.entity.User;
import com.dashboard.login.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@CrossOrigin(origins = "*")   // Allow requests from any origin
@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    // ✅ POST API: Add user
    @PostMapping
    public ResponseEntity<User> addUser(@RequestBody User user) {
        System.out.println("Post is called");
        User savedUser = userService.saveUser(user);
        return ResponseEntity.ok(savedUser);
    }

    // ✅ GET API: Retrieve all users
    @GetMapping
    public ResponseEntity<List<User>> getAllUsers() {
        System.out.println("Get is called by Adi");
        List<User> users = userService.getAllUsers();
        return ResponseEntity.ok(users);
    }
}