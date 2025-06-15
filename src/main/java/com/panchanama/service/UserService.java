package com.panchanama.service;

import com.panchanama.entity.User;
import com.panchanama.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // Save user
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    // Get all users
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // Get user by ID
    public User getUserById(int id) {
        return userRepository.findById(id).orElse(null);
    }
    
    public Map<String, Object> validateUser(String email, String password) {
        Map<String, Object> response = new HashMap<>();
        User user = userRepository.findByEmailAndPassword(email, password);

        if (user != null) {
            response.put("code", 200);
            response.put("message", "Login successful");
        } else {
            response.put("code", 401);
            response.put("message", "Invalid email or password");
        }

        return response;
    }

}
