package com.example.drogueria.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContactoController {

    @PostMapping("/enviar")
    public String enviarMensaje(
            @RequestParam String nombre,
            @RequestParam String correo,
            @RequestParam String telefono,
            @RequestParam String mensaje) {

        System.out.println("Nuevo mensaje:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Correo: " + correo);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Mensaje: " + mensaje);


        return "redirect:/contacto";
    }
}
