package com.day_one.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import java.util.Arrays;

@Controller
public class ViewController {
    
    @GetMapping("/view")
    public String showView(Model model) {
        List<String> fruits = Arrays.asList("C", "Python", "Rust");
        model.addAttribute("fruitsList", fruits);   
        return "view";
    }

    @PostMapping("/welcome")
    public String handleForm(@RequestParam String username, Model model) {
        model.addAttribute("message", "Bienvenue, " + username + " !");
        return "view";
    }
}
