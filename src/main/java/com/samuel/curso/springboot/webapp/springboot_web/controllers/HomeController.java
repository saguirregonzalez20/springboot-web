package com.samuel.curso.springboot.webapp.springboot_web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping({"", "/", "/home"})
    public String home() {

        //return "redirect:/list";
        return "forward:/list";
    }

    /*
    @GetMapping({"", "/", "/home"})
    public String home() {

        //return "redirect:/list";
        return "forward:/list";
    }
    */
}
