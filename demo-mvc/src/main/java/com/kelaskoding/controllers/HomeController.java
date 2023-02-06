package com.kelaskoding.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kelaskoding.service.ProductService;

@Controller
@RequestMapping("")
public class HomeController {


    @Autowired
    private ProductService productService;

    @GetMapping
    public String welcome(Model model){
        //String yang akan direturn ke index.html ditandai petik dua
        //Doing Something
        String message = "Welcome Spring Boot Cah Ganteng";
        model.addAttribute("msg",message);
        model.addAttribute("products", productService.findAll());

        return "index";
    }
    
}
