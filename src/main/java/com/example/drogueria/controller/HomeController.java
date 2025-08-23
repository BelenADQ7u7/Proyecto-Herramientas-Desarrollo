package com.example.drogueria.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class HomeController {
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("titulo","IGAN PERUANA");
        return "index";
    }

    @GetMapping("/empresa")
    public String empresa() {
        return "empresa"; // vista empresa.html
    }

    @GetMapping("/contacto")
    public String contactanos() {
        return "contacto"; // vista contacto.html
    }
}
