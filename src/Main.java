import loosecoupling.EmailNotificationService;
import loosecoupling.NotificationService;
import tight.UserService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.public class Main {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
  public class Main{
   public static void main(String args[]){
      UserService user=new UserService();
      user.notifyUser("Order placed");

       NotificationService emailservice = new EmailNotificationService();
       //dependecy injection
       //constructor injection
      loosecoupling.UserService userserviceloose=new loosecoupling.UserService(emailservice);
      userserviceloose.notifyUser("Order Processed");
      /*
      Constructor injection - dependency is provided via constructor
      Setter Injection - dependency is provided via setter method

      Field Injection - dependency is assigned directly to a field
       */
       loosecoupling.UserService userservicesetter=new loosecoupling.UserService();
   //setter injection
       userserviceloose.setNotificationservice(emailservice);
      //field injection
       userservicesetter.notificationservice=emailservice;
    }
}
