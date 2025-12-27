package org.example.firstspringboot;

import org.example.app.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloApplication {

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello World!";
    }

  /*  @GetMapping("/user")
    public User getUser(){
        User user=new  User(1,"Jonsi","jony@gmail.com");
        return user;
    }
    */;

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public User getUser(){
        return new User(1,"Jonsi",
                "jony@gmail.com");
    }


}
