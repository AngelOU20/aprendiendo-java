package com.julio.aprendiendojava.controllers;

import com.julio.aprendiendojava.models.User;
import com.julio.aprendiendojava.models.dto.UserDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

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

    @GetMapping("/get-user-list")
    public List<User> userList(){

/*
        La lógica de negocio no se maneja en el controlador. Sino en un
        services o repository
*/

        User user = new User("Julio Angel", "Ucharima Ortiz");
        User user2 = new User("Lionel Andres", "Messi Cuccitini");
        User user3 = new User("Cristiano Ronaldo", "Dos Santos Aveiro");

/*
        List<User> users = new ArrayList<>();
        users.add(user);
        users.add(user2);
        users.add(user3);
*/

//      Usando la clase helpers Arrays
//      List<User> users = Arrays.asList(user, user2, user3);

        return Arrays.asList(user, user2, user3); // O return users

    }
}
