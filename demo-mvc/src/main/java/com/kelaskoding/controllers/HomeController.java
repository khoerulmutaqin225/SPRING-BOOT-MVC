package com.kelaskoding.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kelaskoding.entity.Product;
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

    @GetMapping("/add")
    public String add(Model model){
        model.addAttribute("product", new Product(8L,"006","Product 008", 800000.0 ));
        return "add";
    }

    @PostMapping("/save")
    public String save(Product product, Model model){
        // System.out.println(product);
        productService.addProduct(product);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") Long id){
        // servise untuk hapus
        productService.deleteById(id);
        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, Model model){
        //Call ServicById
        model.addAttribute("product",productService.findById(id));
        return "edit";
    }

    @PostMapping("/update")
    public String update(Product product, Model model){
        productService.updateProduct(product);

        return "redirect:/";
    }



}
