package com.codegym.ioc.none_ioc.controller;

import com.codegym.ioc.none_ioc.service.EmailService;
import com.codegym.ioc.none_ioc.service.FacebookService;

public class ContactController {

//    private FacebookService facebookService = null;
    private EmailService emailService = null;

    public ContactController() {
//        facebookService = new FacebookService();
        emailService = new EmailService();
    }

    public void send() {
//        facebookService.sendMessage();
        emailService.sendMessage();
    }
}
