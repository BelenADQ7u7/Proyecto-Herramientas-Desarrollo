# Proyecto-Herramientas-Desarrollo
Gestión de Proyecto: https://trello.com/invite/b/6908e7bf23cfb2c99076e476/ATTI97d8ed433849dbc2f7e7d43fa073599fB48BF216/proyecto-herramientas-desarrollo
- Agregar captura de la gestión de proyectos.
  
-- Resumen: 
## Desarrollo y Estructura del Módulo de Administración

Se ha completado la **implementación del $back-end$** del sistema para el módulo de administrador, siguiendo una arquitectura por capas. Esto incluyó la creación de **Entidades** ($Entities$) para la representación de datos, la lógica de negocio centralizada en los **Servicios** ($Services$), la manipulación de datos a través de los **Repositorios** ($Repositories$), y los puntos de acceso mediante los **Controladores** ($Controllers$). Este enfoque garantiza la **separación de responsabilidades** y facilita el mantenimiento y la escalabilidad del sistema.

Actualmente, el módulo de administración ya cuenta con **vistas HTML iniciales** para la gestión interna. Estas incluyen un **$Dashboard$ (panel de control)** que servirá como punto central de información y una vista específica para la **Gestión de Productos**. El objetivo principal de esta sección es permitir al administrador realizar las **operaciones CRUD** (Crear, Leer, Actualizar, Eliminar) sobre el catálogo de productos, asegurando el control total sobre el inventario y la oferta.

***

## Mejoras en la Interfaz de Usuario ($UI$) y la Identidad Visual

Se ha puesto especial atención en la **mejora de la apariencia visual** de la aplicación web para asegurar su **alineación con el manual de marca** de la empresa. Esto abarcó la aplicación coherente de la **paleta de colores** corporativa y la estandarización de los **componentes de la interfaz** (botones, tarjetas, tipografía), lo que resulta en una experiencia de usuario más profesional y consistente.


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



---

## 🚀 Beneficios Resumidos de Docker

| Beneficio Clave | ¿Qué Resuelve? | Cómo se Aplica al Proyecto |
| :--- | :--- | :--- |
| **1. Consistencia Ambiental** | El problema de "funciona en mi máquina, pero no en la tuya". | **Garantiza** que siempre se use la versión correcta de Java y las bibliotecas, eliminando errores de incompatibilidad de versiones. |
| **2. Aislamiento** | Mezcla de configuraciones y bases de datos locales. | Puedes ejecutar una base de datos **PostgreSQL en un contenedor separado** que solo tu app usa, sin afectar tu sistema operativo. |
| **3. Despliegue Simplificado** | Subir y configurar la aplicación en un servidor. | Creas una **única imagen portable** que puede ser ejecutada con un solo comando en cualquier servidor (producción o desarrollo), haciendo el despliegue más rápido y fiable. |
| **4. Portabilidad** | Dificultad para migrar de un servidor a otro. | Tu aplicación se vuelve **fácil de mover** (de tu PC a Vercel/Render, o a cualquier otro proveedor de nube) porque lleva su entorno consigo. |

En resumen, Docker te proporciona una **caja estandarizada** y autosuficiente para tu aplicación, haciendo el desarrollo más **predecible** y el despliegue más **sencillo**.

---

## 🐞 Gestión de Incidentes y Bugs

Utilizamos **Trello** como sistema de seguimiento de incidentes ("Tracker") para registrar, organizar y comunicar todo lo que "no funciona como debería" o las tareas pendientes ("features").

### 1. Convención de Tickets (Issue)

Cada tarea o problema es una **tarjeta (Ticket)** con un identificador único.

* **Formato de Título:** `[TIPO-ID]: Descripción concisa`
* **Tipos de Ticket:**
    * **BUG:** Indica un problema o error que "no funciona como debería" (Ej: `BUG-005: Contraseñas en texto plano`).
    * **FEAT:** Indica una nueva funcionalidad a implementar (Ej: `FEAT-010: Integración de filtros de catálogo`).
    * **TASK:** Tarea interna de refactorización o configuración (Ej: `TASK-003: Actualizar dependencia de Spring Boot`).

### 2. Ciclo de Vida y Estado

El estado de un ticket es representado por la columna de Kanban en Trello y muestra dónde está el problema en su ciclo de vida.

| Estado (Columna) | Descripción |
| :--- | :--- |
| **Open / Backlog** | Recién creado o pendiente de priorización (Inicio del ciclo). |
| **In Progress** | Alguien está trabajando activamente en el arreglo o la funcionalidad. |
| **Resolved** | El desarrollador cree que la corrección está terminada y lista para ser probada (Testing/QA). |
| **Closed** | El QA/Tester confirma que el error ya funciona correctamente (Fin del ciclo). |

### 3. Prioridad y Severidad (Etiquetas)

Todos los tickets de tipo **BUG** deben tener etiquetas de color que definan su impacto y urgencia.

* **Prioridad (Urgencia para el Negocio):**
    * **🔴 Alta:** Debe resolverse inmediatamente (ej: el Login no funciona).
    * **🟡 Media:** Es importante pero no bloquea el uso (ej: un error visual menor).
    * **🟢 Baja:** Problema estético o corrección de texto.

* **Severidad (Daño al Usuario):**
    * **🟥 Bloqueante:** Impide completamente que el usuario realice una acción crítica (ej: Error al Guardar Producto).
    * **🟧 Crítica:** Causa daño significativo o muestra datos incorrectos (ej: Contraseñas en texto plano).
    * **🟦 Menor:** Problema que afecta la experiencia pero no la funcionalidad principal.
