package com.day_one.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;

@RestController
public class HelloController {
    
    @Value("${greeting.message}")
    private String messageValue;

    @GetMapping("/hello")
    public String sayMessage() {
        return messageValue;
    }
}
