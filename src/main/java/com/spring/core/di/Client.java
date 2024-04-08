package com.spring.core.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {

    public static void main(String[] args) {

        String message = "Hi good morning!";

//        SMSService smsService = new SMSService();
//        EmailService emailService = new EmailService();
//        MessageSender messageSender = new MessageSender(emailService);
//        messageSender.sendMessage(message);
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        MessageSender messageSender = context.getBean(MessageSender.class);
        messageSender.sendMessage(message);
    }
}
