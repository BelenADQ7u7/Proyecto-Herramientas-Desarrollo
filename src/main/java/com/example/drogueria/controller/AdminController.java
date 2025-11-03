package com.example.drogueria.controller;

import com.example.drogueria.service.ProductoService;
import com.example.drogueria.service.UsuarioService;
import com.example.drogueria.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/admin") // Todas las rutas inician con /admin
public class AdminController {

    @Autowired
    private ProductoService productoService;

    // Opcional, pero recomendado para el dashboard
    @Autowired
    private UsuarioService usuarioService;
    @Autowired
    private CategoriaService categoriaService;


    // 1. Dashboard Principal (admin/dashboard.html)
    @GetMapping({"", "/"}) // Mapea /admin y /admin/
    public String dashboard(Model model) {

        // Carga las métricas del Dashboard
        model.addAttribute("totalProductos", productoService.contarTodosLosProductos());
        model.addAttribute("productosDestacados", productoService.contarProductosDestacados());
        model.addAttribute("totalCategorias", categoriaService.contarTodasLasCategorias());
        model.addAttribute("totalUsuarios", usuarioService.contarTodosLosUsuarios());

        // Asegúrate de usar el nombre de archivo que creaste (ej: dashboard.html)
        return "admin/dashboard";
    }

    // 2. Gestión de Productos (admin/gestionProductos.html)
    @GetMapping("/productos")
    public String listarProductos(Model model) {

        // Pasa la lista de productos a la tabla
        model.addAttribute("productos", productoService.findAll());

        // Asegúrate de usar el nombre de archivo que creaste
        return "admin/gestionProductos";
    }

    // 3. Formulario Nuevo/Editar Producto
    @GetMapping("/productos/nuevo")
    public String mostrarFormularioProducto(Model model) {
        // Lógica para pasar un objeto Producto vacío y la lista de Categorías
        // model.addAttribute("producto", new Producto());
        // model.addAttribute("categorias", categoriaService.findAll());

        // Tu formulario original
        return "admin/productoForm";
    }

    // 4. (Ruta de ejemplo para otras gestiones, como Categorías)
    @GetMapping("/categorias")
    public String listarCategorias() {
        return "admin/gestionCategorias";
    }
}