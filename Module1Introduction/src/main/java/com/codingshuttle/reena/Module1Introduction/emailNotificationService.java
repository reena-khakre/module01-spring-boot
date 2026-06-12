package com.codingshuttle.reena.Module1Introduction;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperties;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
//@Qualifier("email")
@ConditionalOnProperty(name= "notification.type",havingValue = "email")
public class emailNotificationService implements NotificationService {
    @Override
    public void send() {
        System.out.println("notification successfully sent via email");
    }
}
