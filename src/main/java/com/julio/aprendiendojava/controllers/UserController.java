package com.julio.aprendiendojava.controllers;

import com.julio.aprendiendojava.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model) {
        User user = new User("Julio Angel", "Ucharima Ortiz");

        model.addAttribute("title", "Hi world!!");
        model.addAttribute("user", user);

        return "details";
    }

    @GetMapping("/operations")
    public String operations(Map<String, Object> model) {
        model.put("title", "Hi everyone!");

        return "operations";
    }
}


