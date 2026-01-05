package com.example.controller;


import org.springframework.stereotype.Controller;
import com.example.service.userService;

import java.util.List;

@Controller
public class userController {
    public userController(userService userService) {
        this.userService = userService;
    }

    private userService userService;
    public void createUser(String name){
        userService.addUser(name);
        System.out.println("USER ADDED:" +name);
    }

    public void listUsers(){
        List<String> users=userService.getAllUsers();
        System.out.println("All users:" + users);
    }
}
