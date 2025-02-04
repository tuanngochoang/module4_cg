package com.codegym.ioc.have_ioc.service;

public class EmailService implements MessageService {

    @Override
    public void sendMessage() {
        System.out.println("Email sending...");
    }

}
