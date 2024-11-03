TaskMaster
TaskMaster es una aplicación de gestión de tareas intuitiva y eficiente que permite a los usuarios organizar, priorizar y realizar un seguimiento de sus actividades diarias. Con un diseño amigable y funcionalidades que facilitan la productividad, TaskMaster está diseñada para adaptarse tanto a la vida personal como profesional.

Descripción General
TaskMaster permite al usuario realizar operaciones de creación, edición, eliminación y visualización de tareas, con opciones para asignar prioridades y establecer recordatorios. La aplicación almacena de forma segura los datos del usuario en una base de datos local para garantizar que toda la información esté disponible sin necesidad de conexión a internet.

Funcionalidades
Creación de Tareas: Permite añadir tareas con detalles como título, descripción, fecha de vencimiento y prioridad.
Edición y Eliminación: Posibilidad de modificar o borrar tareas existentes.
Gestión de Prioridades: Los usuarios pueden asignar niveles de prioridad a las tareas para organizarlas según su importancia.
Recordatorios: Incluye notificaciones automáticas para recordar al usuario sobre las tareas pendientes.
Almacenamiento Seguro: Integración con una base de datos local para garantizar que los datos persistan entre sesiones.
Base de Datos Integrada
TaskMaster utiliza Room (una capa de abstracción sobre SQLite) como su base de datos local para almacenar todas las tareas de los usuarios de forma eficiente y segura. Esta base de datos permite:

Persistencia de Datos: Las tareas se guardan en la base de datos, por lo que permanecen almacenadas aunque la aplicación se cierre.
Consultas Rápidas: Consultas optimizadas para acceder a las tareas en función de criterios como prioridad o fecha de vencimiento.
Compatibilidad Offline: Los datos están disponibles sin conexión a internet.
Tecnologías y Herramientas
Lenguaje: Kotlin
IDE: Android Studio
Arquitectura: MVVM (Model-View-ViewModel) para separar la lógica de la interfaz de usuario
Base de Datos: Room (SQLite)
Gradle: Configuración con Kotlin DSL (build.gradle.kts)
Compatibilidad: Android API 21 o superior
Estructura del Proyecto
app: Contiene el código fuente de la aplicación, organizado en módulos como data, ui, viewmodel, y repository.
data: Define las entidades de la base de datos y los DAOs (Data Access Objects) para interactuar con Room.
ui: Incluye las actividades y fragmentos de la interfaz de usuario.
viewmodel: Contiene los ViewModels para la interacción entre la UI y los datos.
repository: Implementa el patrón Repository para gestionar el acceso a datos.
