package com.julio.aprendiendojava.controllers;

import com.julio.aprendiendojava.models.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UserRestController {
    @GetMapping("/get-details")
    public Map<String, Object> details() {
        User user = new User("Julio Angel", "Ucharima Ortiz");

        Map<String, Object> response = new HashMap<>();

        response.put("title", "Hi world!!");
        response.put("user", user);
        //response.put("lastname", user.getLastname());

        return response;
    }
}
