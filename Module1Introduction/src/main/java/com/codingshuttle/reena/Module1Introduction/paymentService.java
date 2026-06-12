package com.codingshuttle.reena.Module1Introduction;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class paymentService
{
    int count;
    void pay()
    {
        System.out.println("paying.....");
    }
    public paymentService(@Value("${app.count}") int count) {
        this.count = count;
    }
    @PostConstruct
    public void  beforeinit()
    {
        System.out.println("before paying");
    }
    @PreDestroy
    void predestroy()
    {
        System.out.println("after payment is done");
    }
}
