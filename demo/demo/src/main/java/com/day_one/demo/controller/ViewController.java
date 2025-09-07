package com.day_one.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@Controller
public class ViewController {
    
    @GetMapping("/view")
    public String showView() {
        return "view";
    }
}
