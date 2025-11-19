package org.trysol.trysol;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.trysol.trysol.NotificationAPi;

@RestController
public class NotificationProcessor {

    @Autowired
    private NotificationAPi notificationAPi;

    @GetMapping("/ttt")
    public String triggernotification(){
        this.notificationAPi.sendNotificationAPI();
       return "notification ";
    }

//    public void setNotificationAPi(NotificationAPi notificationAPi) {
//        this.notificationAPi = notificationAPi;
//    }

}
