package com.example.drogueria.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home() {
        return "index"; // index.html
    }

    @GetMapping("/empresa")
    public String empresa() {
        return "empresa"; // empresa.html
    }

    @GetMapping("/productos")
    public String productos() {
        return "productos"; // productos.html
    }

    @GetMapping("/contacto")
    public String contacto() {
        return "contacto"; // contacto.html
    }
}
