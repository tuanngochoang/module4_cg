package com.codegym.ioc.none_ioc.controller;

import com.codegym.ioc.none_ioc.service.EmailService;
import com.codegym.ioc.none_ioc.service.FacebookService;
import com.codegym.ioc.none_ioc.service.SmsService;

public class HomeController {

//    private SmsService smsService = null;
    private EmailService emailService;

    public HomeController() {
//        smsService = new SmsService();
        emailService = new EmailService();
    }

    public void send() {
//        smsService.sendMessage();
        emailService.sendMessage();
    }
}
