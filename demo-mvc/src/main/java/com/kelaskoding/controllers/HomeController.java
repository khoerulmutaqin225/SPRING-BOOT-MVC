package com.kelaskoding.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class HomeController {

    @GetMapping
    public String welcome(Model model){
        //String yang akan direturn ke index.html ditandai petik dua
        //Doing Something
        String message = "Wecome Spring Boot Mas Err";
        model.addAttribute("msg",message);
        return "index";
    }
    
}
