package com.codegym.ioc.none_ioc.controller;

import com.codegym.ioc.none_ioc.service.EmailService;
import com.codegym.ioc.none_ioc.service.FacebookService;

public class AboutController {

    private EmailService emailService = null;
//    private FacebookService facebookService = null;

    public AboutController() {
        emailService = new EmailService();
//        facebookService = new FacebookService();
    }

    public void send() {
//        facebookService.sendMessage();
        emailService.sendMessage();
    }
}
