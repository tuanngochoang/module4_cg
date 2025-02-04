package com.codegym.ioc.have_ioc;

import com.codegym.ioc.have_ioc.controller.HomeController;
import com.codegym.ioc.have_ioc.service.EmailService;
import com.codegym.ioc.have_ioc.service.FacebookService;
import com.codegym.ioc.have_ioc.service.MessageService;
import com.codegym.ioc.have_ioc.service.SmsService;

public class Application02 {

    public static void main(String[] args) {
        MessageService smsService = new SmsService();
        MessageService emailService = new EmailService();
        MessageService facebookService = new FacebookService();

        HomeController homeController = new HomeController(emailService);
        homeController.send();
    }
}
