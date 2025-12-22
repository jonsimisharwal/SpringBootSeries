package com.example;

import com.example.Config.AppConfig;
import com.example.controller.userController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String args[]){
        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        userController controller =context.getBean(userController.class);
        controller.createUser("Alice");
        controller.listUsers();
    }
}
