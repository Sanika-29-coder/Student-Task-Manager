package com.student.taskmanager.controller;

import com.student.taskmanager.model.User;
import com.student.taskmanager.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final UserService service;

    public AuthController(UserService service) {
        this.service = service;
    }

    // Login endpoint
    @PostMapping("/login")
    public ResponseEntity<User> login(@RequestBody User user) {
        User loggedInUser = service.login(user.getUsername(), user.getPassword());
        if (loggedInUser != null) {
            return ResponseEntity.ok(loggedInUser);
        } else {
            return ResponseEntity.status(401).build(); // Unauthorized
        }
    }

    // Optional: Register endpoint
    @PostMapping("/register")
    public ResponseEntity<User> register(@RequestBody User user) {
        User savedUser = service.register(user);
        return ResponseEntity.ok(savedUser);
    }
}
