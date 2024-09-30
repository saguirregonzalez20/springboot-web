package com.samuel.curso.springboot.webapp.springboot_web.controllers;

//import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.samuel.curso.springboot.webapp.springboot_web.models.User;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model) {
        User user = new User("Andres", "Guzman");
        user.setEmail("andres@correo.com");

        model.addAttribute("title", "Hola Mundo Spring Boot");
        //model.addAttribute("name", "Andres");
        //model.addAttribute("lastname", "Guzman");
        model.addAttribute("user", user);
        
        return "details";
    }

    @GetMapping("/list")
    public String list(ModelMap model) {
        //List<User> users = new ArrayList<>();
        //users.add(new User("Daniel", "Aguirre"));
        model.addAttribute("title", "Listado de Usuarios!");
        return "list";
    }

    @GetMapping("/details_example_maps")
    public String details(Map<String, Object> model) {
        
        model.put("title", "Hola Mundo Spring Boot Maps");
        model.put("name", "Samuel");
        model.put("lastname", "Aguirre");
        
        return "details";
    }


    //nuevo concepto model attribute
    //esto hace que se genere un objet que estara disponible para todos atributos del controlador
    @ModelAttribute("users")
    public List<User> usersModel() {

        List<User> users = Arrays.asList(
            new User("Pepa","Gonzalez"),
            new User("Samuel","Aguirre", "samuel@correo.com"),
            new User("Toño","Vargas", "tono@correo.com"));
        
        return users;
    }
}
