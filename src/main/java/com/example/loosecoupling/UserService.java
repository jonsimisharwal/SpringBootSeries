package com.example.loosecoupling;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
@Repository
@Controller
@Component("UserServiceeman")
public class UserService {

  public NotificationService notificationservice;

  @Autowired
  public UserService(NotificationService notificationservice){
          this.notificationservice=notificationservice;
  }
   public void notifyUser(String message){

       notificationservice.send("Notification hello");
   }

    public void setNotificationservice(NotificationService notificationservice) {
        this.notificationservice = notificationservice;
    }
}
