# IngSoftware
Repositorio para la clase de Ing de Software.

Este repositorio contiene los proyectos desarrollados durante el curso de Ingeniería de Software, con enfoque en patrones de diseño. Actualmente, se han implementado los patrones de diseño **Singleton** y **Factory**.

## Proyectos

### 1. **Singleton**

**Descripción**: En este proyecto se implementó el patrón de diseño **Singleton**, que garantiza que una clase tenga una única instancia y proporcione un punto de acceso global a ella. Se desarrolló una solución para un juego que necesita gestionar configuraciones globales de manera uniforme en todas sus partes. El patrón asegura que todas las configuraciones sean consistentes y fácilmente modificables en tiempo de ejecución.

**Clases principales**:
- `Configuracion`: Clase que maneja las configuraciones globales del juego.
- `Juego`: Clase que simula el funcionamiento del juego, utilizando la configuración global.
- `Lobby`: Clase que simula un lobby en el que se acceden y modifican las configuraciones globales.

**Cómo usar**:
1. Accede a la instancia única de la clase `Configuracion` mediante su método estático.
2. Modifica las configuraciones globales del juego según sea necesario.

### 2. **Factory**

**Descripción**: En este proyecto se implementó el patrón de diseño **Factory** para crear diferentes tipos de productos (libros, revistas y periódicos) sin necesidad de especificar la clase concreta que debe ser instanciada. El patrón Factory se utilizó para centralizar la creación de estos productos y facilitar la extensión del sistema en el futuro.

**Clases principales**:
- `Producto`: Interfaz común para todos los productos (Libro, Revista, Periódico).
- `Libro`: Implementación de la clase producto tipo libro.
- `Revista`: Implementación de la clase producto tipo revista.
- `Periodico`: Implementación de la clase producto tipo periódico.
- `Factory`: Clase que encapsula la creación de los diferentes tipos de productos.

**Cómo usar**:
1. Utiliza la clase `Factory` para crear productos según el tipo deseado.
2. Los productos creados implementan la interfaz `Producto` y pueden ser utilizados de manera uniforme.

## Requisitos

- JDK 8 o superior.
- IDE recomendado: IntelliJ IDEA, Eclipse o NetBeans.

## Instalación

1. Clona el repositorio en tu máquina local:
   ```bash
   git clone https://github.com/MarcusMario/ingSoftware.git
