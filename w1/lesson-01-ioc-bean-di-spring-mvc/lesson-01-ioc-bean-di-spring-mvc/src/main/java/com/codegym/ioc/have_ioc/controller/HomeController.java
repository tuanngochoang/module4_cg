package com.codegym.ioc.have_ioc.controller;

import com.codegym.ioc.have_ioc.service.MessageService;

public class HomeController {

    private MessageService messageService;

    //Constructor Injection
    public HomeController(MessageService messageService) {
        this.messageService = messageService;
    }

    public void send() {
        messageService.sendMessage();
    }
}
