package com.example.loosecoupling;



public class UserService {

  public NotificationService notificationservice;
  public UserService(){

  }
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
