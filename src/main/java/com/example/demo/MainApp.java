package com.example.demo;

import com.example.loosecoupling.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
public static void main(String args[]){
    ApplicationContext context=new ClassPathXmlApplicationContext("applicationBeanContext.xml");
    GreetingService greetingService=(GreetingService) context.getBean("jonsibean");
    greetingService.sayHello();

    UserService userServiceEmail=(UserService) context.getBean("UserServiceeman");
    userServiceEmail.notifyUser("what's up");
}
}
