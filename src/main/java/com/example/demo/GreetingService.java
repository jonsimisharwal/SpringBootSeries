package com.example.demo;

import org.springframework.stereotype.Component;

@Component("jonsibean")
public class GreetingService {

    public void sayHello(){
        System.out.println("Hello from Spring!");
    }
}
