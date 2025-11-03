package com.example.drogueria.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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

    // Rutas para Login y Registro (Públicas, pero manejadas por Spring Security)
    @GetMapping("/login")
    public String showLoginForm(Model model) {
        // La vista es compartida: login_registro.html (o el nombre que usaste)
        // Necesitas pasar un objeto Usuario para el formulario de Registro (th:object="${usuario}")
        if (!model.containsAttribute("usuario")) {
            // Asume que tienes una clase Usuario en com.example.drogueria.entity
            model.addAttribute("usuario", new com.example.drogueria.entity.Usuario());
        }
        // Devuelve el nombre de tu nuevo template combinado de login/registro
        return "login_registro";
    }

    // La ruta POST de /registro debería estar aquí o en un controlador dedicado de Registro/Usuario.
}