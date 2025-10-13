package com.example.drogueria.service;

import com.example.drogueria.entity.Usuario;
import com.example.drogueria.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    // Lógica para encontrar un usuario por email (usado en el login)
    public Optional<Usuario> buscarPorEmail(String email) {
        // CORRECCIÓN: Si el repositorio devuelve Optional, solo haz 'return' directo.
        return usuarioRepository.findByEmail(email);
    }

    // Aquí iría la lógica de verificación de contraseña y autenticación (usando Spring Security).
    public boolean verificarCredenciales(String email, String password) {
        Optional<Usuario> usuario = buscarPorEmail(email);

        if (usuario.isPresent()) {
            // NOTA: En un proyecto real, se debe usar BCryptPasswordEncoder para hashear la contraseña.
            // Por ahora, asumimos una comparación simple o Spring Security se encargará.
            return usuario.get().getPassword().equals(password);
        }
        return false;
    }
}