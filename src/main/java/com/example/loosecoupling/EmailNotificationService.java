package com.example.loosecoupling;

<<<<<<< HEAD
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
=======
>>>>>>> 3704f0a18a0e402613b8c70515d0da4ee0b12d1a
public class EmailNotificationService implements NotificationService {
    @Override
    public void send(String message) {
        System.out.println("message:"+message);
    }
}
