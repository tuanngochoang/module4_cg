package com.codegym.bean.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class IoCContainer02 {

    @Bean
    public Developer fullstack() {
        Developer fullstack = new Developer();
        fullstack.setId(3);
        fullstack.setName("Cuong");
        fullstack.setMajor("FullStack");
        return fullstack;
    }

    @Bean
    public Developer devops() {
        Developer devops = new Developer();
        devops.setId(4);
        devops.setName("Dao");
        devops.setMajor("DevOps");
        return devops;
    }
}
