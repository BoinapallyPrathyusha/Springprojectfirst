package org.trysol.trysol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class NotificationClient {
    public static void main(String[] args) {


        ApplicationContext context = SpringApplication.run(NotificationClient.class);
        NotificationProcessor notificationProcessor = context.getBean(NotificationProcessor.class);
        notificationProcessor.triggernotification();

//        NotificationProcessor notificationProcessor = new NotificationProcessor();
//        notificationProcessor.setNotificationAPi(new EmailNotificationAPi());
//        notificationProcessor.triggernotification();

    }


}
