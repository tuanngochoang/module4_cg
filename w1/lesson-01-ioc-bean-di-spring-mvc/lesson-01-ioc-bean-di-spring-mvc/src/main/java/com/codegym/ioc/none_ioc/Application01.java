package com.codegym.ioc.none_ioc;

import com.codegym.ioc.none_ioc.controller.HomeController;

public class Application01 {

    public static void main(String[] args) {
        HomeController homeController = new HomeController();
        homeController.send();//sms sending
    }
}
