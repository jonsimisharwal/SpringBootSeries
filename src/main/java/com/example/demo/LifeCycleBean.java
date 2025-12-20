package com.example.demo;

import com.example.loosecoupling.NotificationService;
import org.springframework.stereotype.Component;

@Component
public class LifeCycleBean {
    private NotificationService notificationservice;

    public LifeCycleBean(NotificationService notificationservice){
        System.out.println("Constructor Called : Dependency injected");
        this.notificationservice=notificationservice;
    }
    public void init(){
        System.out.println("init called: bean initialized");
        notificationservice.send("Helllo from init()");
    }
    public void performTask(){
        System.out.println("Ready for use");
    }
    public void cleanup(){
        System.out.println("cleanup() being called");
    }
}
