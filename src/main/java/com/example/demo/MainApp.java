package com.example.demo;

import com.example.loosecoupling.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
public static void main(String args[]){
   /*
    ApplicationContext contexts=new AnnotationConfigApplicationContext(Appconfig.class);
    GreetingService greetingService=(GreetingService) contexts.getBean("jonsibean");
    greetingService.sayHello();
    UserService userServiceEmail=(UserService) contexts.getBean("UserServiceeman");
    userServiceEmail.notifyUser("what's up");

    */
    System.out.println("Starting Spring Application Context");
    ApplicationContext contexts=new AnnotationConfigApplicationContext(Appconfig.class);
      System.out.println("Retrieving lifecycle Bean");
      LifeCycleBean lifecycleBean = contexts.getBean(LifeCycleBean.class);
      lifecycleBean.performTask();
      System.out.println("closing spring context");

}
}
