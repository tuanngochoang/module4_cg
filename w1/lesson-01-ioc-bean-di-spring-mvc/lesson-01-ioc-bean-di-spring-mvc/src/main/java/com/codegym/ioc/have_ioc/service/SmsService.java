package com.codegym.ioc.have_ioc.service;

public class SmsService implements MessageService {

    @Override
    public void sendMessage() {
        System.out.println("Sms sending...");
    }

}
