# IngSoftware
Repositorio para la clase de Ing de Software.

Este repositorio contiene los proyectos desarrollados durante el curso de Ingeniería de Software, con enfoque en patrones de diseño. Actualmente, se han implementado los patrones de diseño **Singleton** y **Factory**. Ademas de incluir un ejercicio de 5 ejemplos a los cuales se les aplica una mejora de codigo implementando los principios SOLID. 

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

### 3. **Mejoras en Código Java (5 Ejemplos)**

**Descripción:** Este proyecto está compuesto por cinco ejemplos de código en Java, en los cuales se identifican diversos problemas de diseño y se proponen soluciones basadas en principios de diseño sólido. Los ejemplos abarcan una variedad de temas, desde la violación del principio de responsabilidad única hasta problemas de herencia y la falta de flexibilidad en el código. Cada ejemplo es seguido de una justificación detallada y una propuesta de mejora que sigue principios fundamentales de la ingeniería de software, como la modularidad, la reutilización de código, la legibilidad, y el acoplamiento bajo.

En cada uno de estos ejemplos se aplica un enfoque diferente para mejorar la calidad del código y garantizar su mantenibilidad, escalabilidad y flexibilidad a largo plazo.

**Ejemplos de código:**
1. **Ejemplo 1:**
   - **Descripción:** Se aborda un caso donde varias responsabilidades están mezcladas en una clase, violando el principio de responsabilidad única.
   - **Mejoras:** Se introduce la separación de responsabilidades mediante la creación de nuevas clases con roles bien definidos, y se utiliza la composición en lugar de la herencia donde sea necesario.

2. **Ejemplo 2:**
   - **Descripción:** Un ejemplo donde se viola el principio de sustitución de Liskov debido a un uso incorrecto de herencia, haciendo que el código sea difícil de extender.
   - **Mejoras:** Se refactoriza el código para utilizar interfaces y clases abstractas que mejoren la flexibilidad, permitiendo que el sistema se pueda extender sin modificar las clases existentes.

3. **Ejemplo 3:**
   - **Descripción:** Este código implementa un registro de actividad de usuario donde se repite la lógica de guardado y validación. Hay duplicación de código y un bajo nivel de modularidad.
   - **Mejoras:** Se reorganiza el código para que el registro y validación estén encapsulados en clases específicas que sigan el principio de responsabilidad única. Además, se extraen métodos repetitivos y se crea una interfaz para que el sistema de registro sea fácilmente extensible (por ejemplo, añadiendo nuevos destinos de registro como bases de datos o servicios en la nube).

4. **Ejemplo 4:**
   - **Descripción:** Aquí se calcula el total de una factura, pero los cálculos y la gestión de descuentos están siendo realizados en el mismo método, lo que genera código redundante y poco legible.
   - **Mejoras:** Se introduce un método por cada tipo de cálculo (cálculo básico, con descuento, etc.) para que el código sea más legible y modular. Además, se crea una clase de `Factura` para gestionar todos los cálculos relacionados con la facturación, respetando el principio de responsabilidad única.

5. **Ejemplo 5:**
   - **Descripción:** Se implementa un sistema de alertas que depende directamente de un objeto específico para enviar las notificaciones (como un enviador de correos). Esto limita la flexibilidad y dificulta las pruebas y cambios en el futuro.
   - **Mejoras:** Se aplica el principio de inversión de dependencias, desacoplando la lógica de negocio de los detalles de implementación mediante interfaces. Así, es posible intercambiar el tipo de servicio de alerta (por ejemplo, enviando notificaciones por SMS en lugar de correo electrónico) sin modificar el código existente.

**Objetivo del Proyecto:**
El objetivo de este proyecto es demostrar cómo una refactorización adecuada de código puede mejorar la calidad del software y hacer que sea más mantenible a lo largo del tiempo. Además, se busca promover las mejores prácticas en la programación orientada a objetos, como el uso de principios SOLID, para construir sistemas que sean fácilmente extensibles, flexibles y que sigan los patrones de diseño adecuados.

**Arquitectura y Diseño:**
Cada uno de los ejemplos tiene su propia justificación de las decisiones de diseño y la refactorización. A lo largo de los ejemplos, se hace hincapié en el uso de principios como:
- **Responsabilidad única (SRP):** Cada clase debe tener una sola responsabilidad y no hacer más de una cosa.
- **Abierto/Cerrado (OCP):** El código debe estar abierto para extensión pero cerrado para modificación.
- **Sustitución de Liskov (LSP):** Las clases derivadas deben poder reemplazar a sus clases base sin alterar la funcionalidad del sistema.
- **Segregación de interfaces (ISP):** Las clases no deben depender de interfaces que no usan.
- **Inversión de dependencias (DIP):** Los módulos de alto nivel no deben depender de módulos de bajo nivel, sino de abstracciones.

**Cómo usar:**
- Revisa los archivos `.java` de cada uno de los ejemplos. Cada uno contiene el código original con sus respectivos problemas y la versión refactorizada que resuelve esos problemas.
- En cada ejemplo, también encontrarás archivos `.txt` con justificaciones detalladas que explican las decisiones tomadas y los principios aplicados.

## Requisitos

- JDK 8 o superior.
- IDE recomendado: IntelliJ IDEA, Eclipse o NetBeans.

## Instalación

1. Clona el repositorio en tu máquina local:
   ```bash
   git clone https://github.com/MarcusMario/ingSoftware.git
