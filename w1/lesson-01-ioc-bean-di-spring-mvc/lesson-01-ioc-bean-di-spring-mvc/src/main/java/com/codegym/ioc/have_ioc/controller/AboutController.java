package com.codegym.ioc.have_ioc.controller;

import com.codegym.ioc.have_ioc.service.MessageService;

public class AboutController {

    private MessageService messageService;

    public AboutController(MessageService messageService) {
        this.messageService = messageService;
    }

    public void send() {
        messageService.sendMessage();
    }
}
