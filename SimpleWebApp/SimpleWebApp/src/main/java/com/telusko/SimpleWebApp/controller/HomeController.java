package com.telusko.SimpleWebApp.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    
    @RequestMapping("/")
    public String greet() {
        return "hello raj";
    }

    @RequestMapping("/about")
    public String about() {
        return "we dont teach!!!";
    }
}
