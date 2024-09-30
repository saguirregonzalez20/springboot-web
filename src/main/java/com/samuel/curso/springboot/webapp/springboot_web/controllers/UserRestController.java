package com.samuel.curso.springboot.webapp.springboot_web.controllers;

//import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.samuel.curso.springboot.webapp.springboot_web.models.User;
import com.samuel.curso.springboot.webapp.springboot_web.models.dto.UserDto;

@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping("/details")
    public UserDto details() {
        UserDto userDto = new UserDto();
        User user = new User("Andres", "Guzman");

        userDto.setUser(user);
        userDto.setTitle("Hola Mundo Spring Boot");
        
        return userDto;
    }

    @GetMapping("/list")
    public List<User> list() {
        User user = new User("Andres", "Guzman");
        User user2 = new User("Pepe", "Doe");
        User user3 = new User("Jhon", "Aguirre");

        //Example 1
        List<User> users = Arrays.asList(user, user2, user3);

        //Example 2
        //List<User> users = new ArrayList<>();
        //users.add(user);
        //users.add(user2);
        //users.add(user3);

        return users;
    }

    @GetMapping("/details-map")
    public Map<String, Object> detailsMap() {
        User user = new User("Andres", "Guzman");
        Map<String, Object> body = new HashMap<>();

        body.put("title", "Hola Mundo Spring Boot");
        //body.put("name", "Andres");
        //body.put("lastname", "Guzman");
        body.put("user", user);
        
        return body;
    }

    @RequestMapping(path="/details_example_get", method = RequestMethod.GET)
    public Map<String, Object> details2() {
        Map<String, Object> body = new HashMap<>();

        body.put("title", "Hola Mundo Spring Boot");
        body.put("name", "Andres");
        body.put("lastname", "Guzman");
        
        return body;
    }

}
