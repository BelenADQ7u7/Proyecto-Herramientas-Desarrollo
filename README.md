# Proyecto-Herramientas-Desarrollo


-- Resumen: 
## Desarrollo y Estructura del Módulo de Administración

Se ha completado la **implementación del $back-end$** del sistema para el módulo de administrador, siguiendo una arquitectura por capas. Esto incluyó la creación de **Entidades** ($Entities$) para la representación de datos, la lógica de negocio centralizada en los **Servicios** ($Services$), la manipulación de datos a través de los **Repositorios** ($Repositories$), y los puntos de acceso mediante los **Controladores** ($Controllers$). Este enfoque garantiza la **separación de responsabilidades** y facilita el mantenimiento y la escalabilidad del sistema.

Actualmente, el módulo de administración ya cuenta con **vistas HTML iniciales** para la gestión interna. Estas incluyen un **$Dashboard$ (panel de control)** que servirá como punto central de información y una vista específica para la **Gestión de Productos**. El objetivo principal de esta sección es permitir al administrador realizar las **operaciones CRUD** (Crear, Leer, Actualizar, Eliminar) sobre el catálogo de productos, asegurando el control total sobre el inventario y la oferta.

***

## Mejoras en la Interfaz de Usuario ($UI$) y la Identidad Visual

Se ha puesto especial atención en la **mejora de la apariencia visual** de la aplicación web para asegurar su **alineación con el manual de marca** de la empresa. Esto abarcó la aplicación coherente de la **paleta de colores** corporativa y la estandarización de los **componentes de la interfaz** (botones, tarjetas, tipografía), lo que resulta en una experiencia de usuario más profesional y consistente.

Adicionalmente, se **mejoró la barra de navegación ($nav$)** para enriquecer la funcionalidad del usuario final. Específicamente, se incorporaron dos elementos esenciales:

1.  Un **apartado de Carrito de Compras**, que facilita la gestión de los productos seleccionados antes de finalizar la compra.
2.  Un ícono o **apartado de Usuario ($user$)**, que proporciona acceso rápido a las funcionalidades de perfil, historial de pedidos e inicio/cierre de sesión.

***

## Investigación de Portabilidad y Estrategia de Despliegue

Como fase crucial del cierre del proyecto, se procederá a **investigar las opciones de portabilidad** más adecuadas para el despliegue de la aplicación web. El objetivo es identificar la **infraestructura y la tecnología de contenedores** óptimas que permitan un despliegue **eficiente, escalable y reproducible** en diferentes entornos de servidor (producción, pruebas, desarrollo). Esta investigación cubrirá la selección de plataformas de alojamiento y las herramientas de $CI/CD$ necesarias para garantizar una transición fluida al entorno de producción.



Beneficios de Trello para tu Proyecto
1. Visibilidad y Seguimiento del Progreso
Trello te permite ver el estado actual de todas las características y tareas de un vistazo.

Flujo de Trabajo (Kanban): Puedes crear listas que representen las fases de desarrollo:

Ideas/Backlog: Donde van las nuevas funcionalidades (Ej: "Implementar método de pago", "Crear filtro de productos por precio").

To Do (Por Hacer): Tareas listas para ser abordadas (Ej: "Diseñar la vista de Dashboard", "Configurar la conexión a Aiven DB").

In Progress (En Progreso): Tareas que se están desarrollando actualmente (Ej: "Codificar UsuarioService").

Review/Testing: Tareas completas que esperan ser probadas (Ej: "Probar el formulario de Login y Registro").

Done (Terminado): Tareas finalizadas y fusionadas con el proyecto principal.

Identificación de Bloqueos: Si una tarjeta se queda mucho tiempo en una columna, es una señal visual inmediata de que hay un problema o un bloqueo que requiere atención (Ej: el error con la contraseña de GitHub).

2. Organización Detallada de Tareas (Tarjetas)
Cada tarea, requisito o bug se convierte en una tarjeta (Card), la unidad de trabajo principal.

Detalles de la Tarea: En cada tarjeta puedes incluir:

Descripción: Los requisitos exactos de la característica (Ej: "El formulario de productos debe incluir campos para precio, stock y categoría").

Checklists: Los pasos de implementación (Ej: "Crear ProductoController", "Crear ProductoRepository", "Diseñar gestionProductos.html").

Archivos Adjuntos: Puedes adjuntar capturas de pantalla, archivos del Manual de Marca de IGAN para referencia de colores, o fragmentos de código.

Asignación: Puedes asignar cada tarjeta a un miembro del equipo para saber quién es responsable de qué.

3. Colaboración y Comunicación Simplificada
Trello elimina la necesidad de largas cadenas de correos electrónicos.

Comentarios: Los miembros del equipo pueden dejar comentarios directamente en la tarjeta de la tarea para hacer preguntas, compartir ideas o informar sobre el progreso.

Fechas de Vencimiento: Permite establecer fechas de entrega (due dates), lo cual es crucial para mantener el cronograma del proyecto.

4. Flexibilidad y Adaptabilidad
Trello es extremadamente simple y flexible, adaptándose bien a los cambios que son comunes en el desarrollo de software.

Cambios Rápidos: Si el cliente decide cambiar la prioridad o si surge un error crítico, es muy fácil mover la tarjeta a la columna de máxima prioridad o crear una nueva tarjeta de "Bug Fix" en el Backlog.

Integración con GitHub: Existen integraciones que te permiten vincular tarjetas de Trello con commits o ramas específicas en GitHub, mejorando la trazabilidad del código. Por ejemplo, una vez que terminas el código en tu rama diaz, puedes marcar la tarjeta como "Testing".


Usar **Docker** en tu proyecto Spring Boot significa que puedes **empaquetar** tu aplicación y sus dependencias (como Java 8) para que **funcione exactamente igual** en cualquier lugar.

---

## 🚀 Beneficios Resumidos de Docker

| Beneficio Clave | ¿Qué Resuelve? | Cómo se Aplica al Proyecto |
| :--- | :--- | :--- |
| **1. Consistencia Ambiental** | El problema de "funciona en mi máquina, pero no en la tuya". | **Garantiza** que siempre se use la versión correcta de Java y las bibliotecas, eliminando errores de incompatibilidad de versiones. |
| **2. Aislamiento** | Mezcla de configuraciones y bases de datos locales. | Puedes ejecutar una base de datos **PostgreSQL en un contenedor separado** que solo tu app usa, sin afectar tu sistema operativo. |
| **3. Despliegue Simplificado** | Subir y configurar la aplicación en un servidor. | Creas una **única imagen portable** que puede ser ejecutada con un solo comando en cualquier servidor (producción o desarrollo), haciendo el despliegue más rápido y fiable. |
| **4. Portabilidad** | Dificultad para migrar de un servidor a otro. | Tu aplicación se vuelve **fácil de mover** (de tu PC a Vercel/Render, o a cualquier otro proveedor de nube) porque lleva su entorno consigo. |

En resumen, Docker te proporciona una **caja estandarizada** y autosuficiente para tu aplicación, haciendo el desarrollo más **predecible** y el despliegue más **sencillo**.

### 1. 🌟 Proyecto

* **Nombre:** Droguería IGAN PERUANA SA
* **Descripción:** Plataforma de gestión de inventario y catálogo de productos farmacéuticos y material médico. Implementado bajo arquitectura MVC.
* **Estado:** En Desarrollo Activo (o el que corresponda).
* **Link de Despliegue (Opcional):** `https://www.youtube.com/watch?v=sxcKVwURuhk`

---

### 2. ⚙️ Stack Tecnológico

Sé muy específico con las versiones para evitar conflictos.

* **Backend:** **Java 8 (JDK 1.8)**, **Spring Boot 2.7.18**.
* **Persistencia:** Spring Data JPA, Hibernate.
* **Base de Datos:** **PostgreSQL** (Aiven Cloud/Docker).
* **Vistas:** **Thymeleaf**, **Bootstrap 5**, Bootstrap Icons.
* **Build Tool:** Maven.

---

### 3. 🛠️ Configuración y Ejecución

Esta sección es crucial para cualquier colaborador.

#### Prerrequisitos
* **Java 8 (JDK 1.8)**
* **Maven**
* **Docker** (Recomendado para desarrollo local de la DB)

#### Pasos para Iniciar
1.  **Clonar:** `git clone https://aws.amazon.com/es/what-is/repo/`
2.  **Credenciales:** Configura la URL, usuario y contraseña de la base de datos PostgreSQL en `src/main/resources/application.properties` (usando variables de entorno `${...}` si es posible).
3.  **Compilar:** `mvn clean install`
4.  **Ejecutar:** `java -jar target/drogueria-0.0.1-SNAPSHOT.jar`
5.  **Acceso:** El panel de administración estará disponible en `http://localhost:8080/admin`.

---

### 4. 🤝 Contribuciones y Contacto

* **Reglas de Contribución:** Usa la metodología Gitflow: Trabaja en una rama separada (`feature/nombre-tarea`) y haz un **Pull Request** para fusionar con `main`.
* **Contacto:** `[Tu correo electrónico]` o `[Tu perfil de LinkedIn/GitHub]`.
* 


Has abordado con éxito problemas de código (el `Optional` duplicado), configuración (`pom.xml`, *drivers* de PostgreSQL), y despliegue/Git (el bloqueo por el *Secret Scanning* de GitHub y la eliminación de Vercel). También has mejorado tus vistas de administrador.

Para finalizar la revisión y asegurar que el proyecto está listo para avanzar, aquí te presento **un punto de corrección crucial** y **dos puntos de mejora** en las mejores prácticas.

-----

## 1\. ⚠️ Corrección Crítica: Seguridad de Contraseñas (El Servicio)

El mayor riesgo actual en tu código es cómo manejas la verificación de contraseñas. Tu `UsuarioService` (código que enviaste al inicio) sigue comparando contraseñas en texto plano:

```java
// Código Actual (INCORRECTO en producción)
public boolean verificarCredenciales(String email, String password) {
    Optional<Usuario> usuario = buscarPorEmail(email);

    if (usuario.isPresent()) {
        // ¡RIESGO DE SEGURIDAD! Comparación en texto plano.
        return usuario.get().getPassword().equals(password); 
    }
    return false;
}
```

### ✅ Solución: Usar BCryptPasswordEncoder

Debes reemplazar la comparación en texto plano con el estándar de Spring Security: **`BCryptPasswordEncoder`**.

#### Pasos de Corrección:

1.  **Asegúrate de tener Spring Security** como dependencia en tu `pom.xml`.
2.  **Modifica el Servicio:**

<!-- end list -->

```java
package com.example.drogueria.service;

import com.example.drogueria.entity.Usuario;
import com.example.drogueria.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder; // Necesitas esta clase
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    // INYECTA BCryptPasswordEncoder aquí
    @Autowired
    private PasswordEncoder passwordEncoder; 

    public Optional<Usuario> buscarPorEmail(String email) {
        return usuarioRepository.findByEmail(email); 
    }

    // Lógica de autenticación mejorada
    public boolean verificarCredenciales(String email, String password) {
        Optional<Usuario> usuario = buscarPorEmail(email);

        if (usuario.isPresent()) {
            // ✅ CORRECCIÓN: Compara el password de texto plano con el hash guardado.
            return passwordEncoder.matches(password, usuario.get().getPassword());
        }
        return false;
    }
}
```

  * *Nota:* Necesitarás configurar el `PasswordEncoder` como un Bean en tu clase de configuración de Spring Security (ej: `SecurityConfig.java`).

-----

## 2\. 💡 Mejoras en Mejores Prácticas

### A. Estandarizar la Nomenclatura del Repositorio

Tu método `findByEmail` es correcto, pero por convención de Spring Data JPA, si el email es único (que debería serlo para un login), el método de búsqueda que se espera en el controlador es a veces solo devolver la entidad o lanzar una excepción si no existe.

  * **Alternativa a `findByEmail`:** Si tu email es único, considera usar **`Optional<Usuario> findByEmail(String email);`** (que ya tienes) o **`Usuario getReferenceByEmail(String email);`** si sabes que la entidad existe.

### B. Uso de DTOs (Data Transfer Objects)

A medida que tu proyecto crezca, enviar la entidad `Usuario` (que incluye la contraseña, incluso hasheada) directamente a las vistas o recibir datos de un formulario directamente en la entidad puede ser riesgoso.

  * **Recomendación:** Crea clases **DTO** (ej: `UsuarioRegistroDTO`, `ProductoFormDTO`) para:
    1.  **Registro:** Solo recibir los campos necesarios (nombre, email, *password*, sin ID ni *roles*).
    2.  **Vistas:** Solo enviar los datos que la vista necesita mostrar, ocultando campos sensibles.

Esto mejora la seguridad, el control y desacopla la capa de presentación de la capa de persistencia.

-----

Una vez que implementes el **BCryptPasswordEncoder**, la seguridad básica de tu proyecto estará robusta. ¿Necesitas ayuda con la configuración del **BCryptPasswordEncoder** en Spring Security?
