package com.example.demo;

import com.example.loosecoupling.UserService;
import org.springframework.context.ApplicationContext;
<<<<<<< HEAD
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
=======
>>>>>>> 3704f0a18a0e402613b8c70515d0da4ee0b12d1a
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
public static void main(String args[]){
<<<<<<< HEAD
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

=======
    ApplicationContext context=new ClassPathXmlApplicationContext("applicationBeanContext.xml");
    GreetingService greetingService=(GreetingService) context.getBean("jonsibean");
    greetingService.sayHello();

    UserService userServiceEmail=(UserService) context.getBean("UserServiceeman");
    userServiceEmail.notifyUser("what's up");
>>>>>>> 3704f0a18a0e402613b8c70515d0da4ee0b12d1a
}
}
