package com.codegym.ioc.have_ioc.controller;

import com.codegym.ioc.have_ioc.service.MessageService;

public class ContactController {

    private MessageService messageService;

    public ContactController(MessageService messageService) {
        this.messageService = messageService;
    }

    public void send() {
        messageService.sendMessage();
    }
}
