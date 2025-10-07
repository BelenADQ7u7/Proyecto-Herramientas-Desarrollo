package com.example.drogueria.repository;

import com.example.drogueria.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // Marca esta interfaz como un componente de acceso a datos
public interface ProductoRepository extends JpaRepository<Producto, Long> {

}
