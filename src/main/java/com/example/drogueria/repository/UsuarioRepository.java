package com.example.drogueria.repository;

import com.example.drogueria.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    /**
     * Busca un usuario por su correo electrónico.
     * Este es el método clave para el proceso de inicio de sesión (Login).
     */
    Optional<Usuario> findByEmail(String email);

}