package com.julio.aprendiendojava.controllers;

import com.julio.aprendiendojava.models.User;
import com.julio.aprendiendojava.models.dto.UserDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UserRestController {
    @GetMapping("/get-details-map")
    public Map<String, Object> detailsMap() {
        User user = new User("Julio Angel", "Ucharima Ortiz");

        Map<String, Object> response = new HashMap<>();

        response.put("title", "Hi world!!");
        response.put("user", user);
        response.put("lastname", user.getLastname());

        return response;
    }

    @GetMapping("/get-details-dto")
    public UserDto detailsDto() {
        User user = new User("Julio Angel", "Ucharima Ortiz");

        UserDto userDto = new UserDto();
        userDto.setUser(user);
        userDto.setTitle("Hi world!! I'm using Spring 3");

        return userDto;
    }
}
