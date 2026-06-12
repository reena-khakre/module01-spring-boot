package com.codingshuttle.reena.Module1Introduction.impl;

import com.codingshuttle.reena.Module1Introduction.NotificationService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
@Qualifier("sms")
@ConditionalOnProperty(name="notification.type",havingValue = "sms")
public class smsNotificationService implements NotificationService {
    @Override
    public void send() {
        System.out.println("notification successfully sent via sms");
    }
}
