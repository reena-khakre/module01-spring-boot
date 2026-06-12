package com.codingshuttle.reena.Module1Introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Module1IntroductionApplication implements CommandLineRunner {

	@Autowired
	paymentService paymentService1 ;

	NotificationService notificationService ;
	public Module1IntroductionApplication( NotificationService notificationService) {
		this.notificationService = notificationService;
	}

	@Autowired
	paymentService paymentService2 ;
	public static void main(String[] args) {

		SpringApplication.run(Module1IntroductionApplication.class, args);
	}
	@Value("${notification.type}")
	String notification;
	@Override
	public void run(String... args) throws Exception {
		/*//SpringApplication.run(Module1IntroductionApplication.class, args);
		System.out.println(paymentService1.hashCode());
		System.out.println(paymentService2.hashCode());
		paymentService1.pay();*/

		notificationService.send();
		System.out.println("notification = " + notification);


	}
}
