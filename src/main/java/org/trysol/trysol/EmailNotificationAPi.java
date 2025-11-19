package org.trysol.trysol;

import org.springframework.stereotype.Component;
import org.trysol.trysol.NotificationAPi;

@Component
public class EmailNotificationAPi implements NotificationAPi {

    @Override
    public void sendNotificationAPI() {
        System.out.println("email sent");
    }
}
