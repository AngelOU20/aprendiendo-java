package com.julio.aprendiendojava.controllers;

import com.julio.aprendiendojava.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model) {
        User user = new User("Julio Angel", "Ucharima Ortiz");
        user.setEmail("julio@angel.com");
        model.addAttribute("title", "Hi world!!");
        model.addAttribute("user", user);

        return "details";
    }

    @GetMapping("/list")
    public String list(ModelMap model) {
//        model.addAttribute("users", users);
        model.addAttribute("title", "Hi world!!");
        return "list";
    }

    // Se almacena en la vista del thymeleaf, ademas de ser global al controller
    @ModelAttribute("users")
    public List<User> usersModel() {
        return Arrays.asList(
                new User("Pepa", "Gonzales", "pepa@gmail.com"),
                new User("julio", "Ucharima Ortiz"),
                new User("Angel", "Karev", "angel.karev@gmail.com"),
                new User("Jo", "Grey")
        );
    }

    @GetMapping("/operations")
    public String operations(Map<String, Object> model) {
        model.put("title", "Hi everyone!");

        return "operations";
    }
}


