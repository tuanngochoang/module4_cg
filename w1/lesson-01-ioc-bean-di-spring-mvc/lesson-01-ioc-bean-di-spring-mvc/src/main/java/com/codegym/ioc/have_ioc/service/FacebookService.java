package com.codegym.ioc.have_ioc.service;

public class FacebookService implements MessageService {

    @Override
    public void sendMessage() {
        System.out.println("Facebook sending...");
    }

}
