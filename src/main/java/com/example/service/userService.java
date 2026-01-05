package com.example.service;

import com.example.repository.userRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userService {
    private userRepository userrepository;

    public userService(userRepository userrepository) {
        this.userrepository = userrepository;
    }

    public void addUser(String user) {
       userrepository.save(user);
    }

    public List<String> getAllUsers() {
        return userrepository.findAll();
    }
}
