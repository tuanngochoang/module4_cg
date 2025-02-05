package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.regex.Pattern;

@Controller
@RequestMapping("/home")
public class EmailController {
    private static final String EMAIL_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
    private static Pattern pattern = Pattern.compile(EMAIL_REGEX);;

    @GetMapping
    public String home() {
        return "home";
    }

    @PostMapping("/check")
    public String check(@RequestParam("email") String email, ModelMap modelMap) {
        boolean isValid = pattern.matcher(email).matches();
        if (isValid) {
            modelMap.addAttribute("email", email);
            return "success";
        } else {
            modelMap.addAttribute("message", "Email is invalid");
            return "home";
        }
    }
}
