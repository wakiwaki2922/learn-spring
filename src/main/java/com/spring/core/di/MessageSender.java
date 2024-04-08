package com.spring.core.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MessageSender {

    //    private SMSService smsService;
    //  private EmailService emailService;
    private MessageService messageService;

    @Autowired
    public MessageSender(@Qualifier("emailService") MessageService messageService) {
//        this.smsService = smsService;
//        this.emailService = emailService;
        this.messageService = messageService;
    }

    public void sendMessage(String message) {
//        this.smsService.sendMessage(message);
//        this.emailService.sendMessage(message);
        this.messageService.sendMessage(message);
    }
}
