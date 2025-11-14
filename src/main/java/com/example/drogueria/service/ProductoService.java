package com.example.drogueria.service;
import com.example.drogueria.entity.Producto;
import com.example.drogueria.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service // Marca esta clase como un Servicio de negocio
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    // 1. Guardar/Actualizar Producto
    public Producto guardarProducto(Producto producto) {
        // Lógica de Negocio: Podrías validar el stock, formato de imagen, etc.
        return productoRepository.save(producto);
    }

    // 2. Listar todos los Productos (Gestión de Inventario/CRUD)
    public List<Producto> obtenerTodosLosProductos() {
        return productoRepository.findAll();
    }

    // 3. Obtener Producto por ID
    public Optional<Producto> obtenerProductoPorId(Long id) {
        return productoRepository.findById(id);
    }

    // 4. Eliminar Producto
    public void eliminarProducto(Long id) {
        productoRepository.deleteById(id);
    }

    // 5. Lógica para la página de Clientes (Obtener solo Destacados)
    // Esto es un ejemplo de lógica de servicio específica para el frontend
    public List<Producto> obtenerProductosDestacados() {
        // Nota: Si quieres destacar productos, tendrías que crear un método en el repositorio:
        // return productoRepository.findByDestacadoTrue();

        // Por ahora, solo devuelve una sub-lista si es necesario:
        List<Producto> all = productoRepository.findAll();
        return all.subList(0, Math.min(all.size(), 6)); // Devuelve los primeros 6 para el carrusel
    }
}
