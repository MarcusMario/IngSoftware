# IngSoftware
---- 

Repositorio para la clase de Ing de Software.

Este repositorio contiene los proyectos desarrollados durante el curso de Ingeniería de Software, con enfoque en patrones de diseño. Actualmente, se han implementado los patrones de diseño **Singleton** y **Factory**. Ademas de incluir un ejercicio de 5 ejemplos a los cuales se les aplica una mejora de codigo implementando los principios SOLID y entre otros temas y ejercicios a desarrollar. 

## Proyectos

---

### 1. **Singleton**

**Descripción**: En este proyecto se implementó el patrón de diseño **Singleton**, que garantiza que una clase tenga una única instancia y proporcione un punto de acceso global a ella. Se desarrolló una solución para un juego que necesita gestionar configuraciones globales de manera uniforme en todas sus partes. El patrón asegura que todas las configuraciones sean consistentes y fácilmente modificables en tiempo de ejecución.

**Clases principales**:
- `Configuracion`: Clase que maneja las configuraciones globales del juego.
- `Juego`: Clase que simula el funcionamiento del juego, utilizando la configuración global.
- `Lobby`: Clase que simula un lobby en el que se acceden y modifican las configuraciones globales.

**Cómo usar**:
1. Accede a la instancia única de la clase `Configuracion` mediante su método estático.
2. Modifica las configuraciones globales del juego según sea necesario.

---

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

---

### 3. **PrincipiosDisenio -- Mejoras en Código Java (5 Ejemplos)**

**Descripción:** Este proyecto está compuesto por cinco ejemplos de código en Java, en los cuales se identifican diversos problemas de diseño y se proponen soluciones basadas en principios de diseño sólido. Los ejemplos abarcan una variedad de temas, desde la violación del principio de responsabilidad única hasta problemas de herencia y la falta de flexibilidad en el código. Cada ejemplo es seguido de una justificación detallada y una propuesta de mejora que sigue principios fundamentales de la ingeniería de software, como la modularidad, la reutilización de código, la legibilidad, y el acoplamiento bajo.

En cada uno de estos ejemplos se aplica un enfoque diferente para mejorar la calidad del código y garantizar su mantenibilidad, escalabilidad y flexibilidad a largo plazo.



#### **Ejemplos de código:**

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



#### **Objetivo del Proyecto:**
El objetivo de este proyecto es demostrar cómo una refactorización adecuada de código puede mejorar la calidad del software y hacer que sea más mantenible a lo largo del tiempo. Además, se busca promover las mejores prácticas en la programación orientada a objetos, como el uso de principios SOLID, para construir sistemas que sean fácilmente extensibles, flexibles y que sigan los patrones de diseño adecuados.



#### **Arquitectura y Diseño:**
Cada uno de los ejemplos tiene su propia justificación de las decisiones de diseño y la refactorización. A lo largo de los ejemplos, se hace hincapié en el uso de principios como:
- **Responsabilidad única (SRP):** Cada clase debe tener una sola responsabilidad y no hacer más de una cosa.
- **Abierto/Cerrado (OCP):** El código debe estar abierto para extensión pero cerrado para modificación.
- **Sustitución de Liskov (LSP):** Las clases derivadas deben poder reemplazar a sus clases base sin alterar la funcionalidad del sistema.
- **Segregación de interfaces (ISP):** Las clases no deben depender de interfaces que no usan.
- **Inversión de dependencias (DIP):** Los módulos de alto nivel no deben depender de módulos de bajo nivel, sino de abstracciones.



#### **Cómo usar:**
- Revisa los archivos `.java` de cada uno de los ejemplos. Cada uno contiene el código original con sus respectivos problemas y la versión refactorizada que resuelve esos problemas.
- En cada ejemplo, también encontrarás archivos `.txt` con justificaciones detalladas que explican las decisiones tomadas y los principios aplicados.

---

### 4. **autos-api -- API REST con Spring Boot + MySQL (Inyección de Dependencias)**

**Descripción**: Este proyecto consiste en una API REST desarrollada con Spring Boot, conectada a una base de datos MySQL 8 que corre en un contenedor Docker.  
La gestión de la base de datos se realiza mediante DBeaver, y el proyecto implementa operaciones POST y GET para una tabla de automóviles.  
Se aplica el patrón de diseño Inyección de Dependencias a través de la anotación `@Autowired`.



#### Tecnologías utilizadas

- Java 17  
- Spring Boot  
- Docker  
- MySQL 8  
- Hibernate (JPA)  
- REST API  
- Inyección de Dependencias (`@Autowired`)  
- DBeaver



**Clases principales**:

- `Automovil`: Entidad JPA que representa la tabla en la base de datos.
- `AutomovilRepository`: Repositorio que extiende `JpaRepository` para realizar operaciones CRUD.
- `AutomovilService`: Servicio donde se inyecta el repositorio con `@Autowired`.
- `AutomovilController`: Controlador REST que maneja las peticiones HTTP.



**Cómo usar**:
1. Inicia el contenedor Docker con MySQL (ver sección "Configuración de conexión").
2. Crea la base de datos `automoviles_db` en DBeaver.
3. Ejecuta la aplicación desde tu IDE.
4. Accede a los endpoints usando Postman o cualquier cliente HTTP.


**Comando para iniciar el contenedor Docker con MySQL:**

```bash
docker run -p 3306:3306 --name is_mysql -e MYSQL_ROOT_PASSWORD=Root.1234 -d mysql:8
```

---

### 5. **API-REST-Computadoras -- API REST con Spring Boot + JPA + Validaciones**

**Descripción**:  Este proyecto consiste en una API REST desarrollada con Spring Boot, que permite gestionar computadoras mediante operaciones CRUD (crear, leer, actualizar, eliminar).
La aplicación utiliza una base de datos relacional (H2 o MySQL), el patrón de diseño Inyección de Dependencias con @Autowired, validaciones con Jakarta Validation y manejo centralizado de errores.

El proyecto sigue una arquitectura por capas: Entidad, Repositorio, Servicio, Controlador y Manejador de Excepciones.



#### ¿Para qué sirve este proyecto?

Sirve para:

-  Registrar computadoras con marca, modelo, precio y foto.
-  Consultar una lista o una computadora específica.
-  Editar total o parcialmente un registro.
-  Eliminar una computadora (opcional).
-  Validar datos obligatorios (como que la marca no esté vacía).
-  Manejar errores de forma clara y controlada.



#### Tecnologías utilizadas

- Java 17  
- Spring Boot  
- Spring Data JPA (Hibernate)
- MySQL 8  
- Maven
- REST API  
- Inyección de Dependencias (`@Autowired`)  
- DBeaver



**Clases principales**:

- `Computadora`: Entidad JPA que representa una computadora con atributos como marca, modelo, foto y precio.
- `ComputadoraRepository`: Repositorio que extiende CrudRepository para realizar operaciones CRUD en la base de datos.
- `ComputadoraService`: Interfaz de servicio que define la lógica de negocio (listar, crear, actualizar, eliminar).
- `ComputadoraServiceImpl`: Implementación del servicio que interactúa con el repositorio.
- `ComputadoraRestController`: Controlador REST que maneja las peticiones HTTP GET, POST, PUT, PATCH.
- `ManejadorGlobalExcepciones`: Clase que captura errores comunes como validaciones y JSON mal formateado, devolviendo respuestas claras al cliente.
- `ComputadoraapiApplication`: Punto de entrada de la aplicación Spring Boot.



#### Estructura del proyecto

```plaintext
src/
└── main/
    └── java/
        └── mx/unam/aragon/ico/is/computadoraapi/
            ├── controllers/           # Controladores REST (API)
            │   └── ComputadoraRestController.java
            ├── entities/              # Modelo de datos (Entidad JPA)
            │   └── Computadora.java
            ├── exceptions/            # Manejo global de errores
            │   └── ManejadorGlobalExcepciones.java
            ├── repositories/          # Acceso a base de datos
            │   └── ComputadoraRepository.java
            ├── services/              # Lógica de negocio
            │   └── interfaces/ComputadoraService.java
            │   └── impl/ComputadoraServiceImpl.java
            └── ComputadoraapiApplication.java  # Punto de entrada
```

#### Principales Endpoints 

```plaintext
| Método | URL                             | Descripción                                  |
|--------|----------------------------------|----------------------------------------------|
| GET    | `/api/v1/computadoras/`         | Lista todas las computadoras                 |
| GET    | `/api/v1/computadoras/{clave}`  | Obtiene una computadora por clave (ID)       |
| POST   | `/api/v1/computadoras/`         | Crea una computadora                         |
| POST   | `/api/v1/computadoras/{id}`     | Devuelve error                               |
| PATCH  | `/api/v1/computadoras/{clave}`  | Actualiza parcialmente una computadora       |
| PUT    | `/api/v1/computadoras/{clave}`  | Reemplaza completamente una computadora      |
| DELETE | *(comentado en código)*         | Elimina una computadora                      |
   

```


---


### 6. pythonHola -- Docker + Python — Script básico ejecutado en contenedor Docker

**Descripción**: 

Este proyecto demuestra cómo construir y ejecutar una imagen Docker que contiene un script de Python. El objetivo principal es entender los pasos para crear un contenedor basado en Ubuntu, instalar Python y ejecutar un archivo `.py` que imprime un mensaje en consola con el nombre del autor.

Este ejercicio forma parte del curso de *Ingeniería de Software* y refuerza conceptos fundamentales de Docker como construcción de imágenes, uso de `Dockerfile`, instalación de paquetes y ejecución de comandos.


#### ¿Para qué sirve este proyecto?

**Sirve para:**

- Comprender cómo se construye una imagen Docker desde cero.
- Automatizar la instalación de dependencias dentro del contenedor.
- Ejecutar scripts de Python dentro de un contenedor aislado.
- Demostrar el funcionamiento de un programa que imprime información del desarrollador.




#### Tecnologías utilizadas

- Docker  
- Ubuntu (imagen base)  
- Python 3  
- Terminal Bash (Linux)  




#### Archivos principales

- `Dockerfile`: Archivo de configuración que define la imagen y los pasos necesarios para ejecutar el script.
- `hola.py`: Script en Python que imprime un mensaje de saludo y el nombre completo del desarrollador.


#### Pasos realizados en terminal

```plaintext

# 1. Crear el directorio y entrar en él
mkdir pythonHola
cd pythonHola

# 2. Crear archivo Python
nano hola.py

# 3. Crear Dockerfile
nano Dockerfile

# 4. Construir la imagen con nombre 'tarea_is'
sudo docker build -t tarea_is .

# 5. Verificar imágenes creadas
sudo docker image ls

# 6. Ejecutar el contenedor
sudo docker run tarea_is


```

---


### 7. websimple -- Spring MVC con Imagen Docker (Amazon Corretto)


**Descripción**: 

Este proyecto consiste en una aplicación web simple desarrollada con **Spring Boot MVC**, utilizando **Thymeleaf** como motor de plantillas, y empaquetada en un **contenedor Docker** basado en la imagen **Amazon Corretto 17 Alpine**.  

La aplicación muestra un mensaje de bienvenida personalizado, incluyendo el nombre de un estudiante y un objeto tipo `Perro` que se envía desde el controlador al archivo HTML.

El objetivo principal fue replicar una aplicación funcional utilizando Spring Boot con el patrón Modelo-Vista-Controlador (MVC). Para la vista, se empleó el motor de plantillas Thymeleaf. La funcionalidad principal consiste en desplegar una página web que muestre un saludo personalizado, incluyendo el nombre del alumno y los datos de un objeto de tipo Perro, instanciado en el controlador y enviado al frontend a través del modelo.

La estructura del proyecto contiene una clase modelo llamada `Perro`, la cual posee atributos básicos como nombre y raza. Se diseñó un controlador principal que maneja las peticiones hacia la raíz del sitio (`/`), y se encarga de generar una instancia de `Perro`, asignarla al modelo y redirigir la vista al archivo `index.html`.

Dentro del archivo HTML ubicado en la carpeta `templates`, se incluye un saludo general, el nombre del alumno, y una línea que saluda dinámicamente al nombre del perro utilizando expresiones Thymeleaf. Esto demuestra el paso de datos desde el backend al frontend de forma dinámica.

El proyecto fue empaquetado utilizando Maven y posteriormente dockerizado. Se creó un archivo `Dockerfile` que utiliza la imagen `amazoncorretto:17-alpine3.17-jdk` como base. En este contenedor se copia el archivo `.jar` generado por Maven, se expone el puerto 8080 y se ejecuta la aplicación con el comando `java -jar`.

Para ejecutar el proyecto, primero se debe compilar con Maven mediante el comando `./mvnw clean package`. Una vez generado el archivo `websimple-0.0.1-SNAPSHOT.jar`, se construye la imagen con Docker usando `sudo docker build -t websimple .` y finalmente se ejecuta con `sudo docker run -p 8080:8080 websimple`. Esto permitirá acceder a la aplicación desde el navegador en `http://localhost:8080`.

Al acceder, el navegador mostrará un saludo general dirigido al grupo IS L, M y V, el nombre del desarrollador y una línea como “Hola, Fido!”, demostrando que la integración entre Spring Boot, Thymeleaf y Docker funciona correctamente.

Este proyecto cumple con todos los requisitos establecidos: la correcta implementación de Spring Boot MVC, uso adecuado de Thymeleaf para vistas dinámicas, correcta configuración y ejecución en contenedor Docker, utilización de una imagen oficial y ligera como Amazon Corretto, y visibilidad del nombre en la interfaz final. También representa un ejemplo básico pero funcional de cómo construir aplicaciones modernas, empaquetables y portables mediante contenedores, ideal para entornos de desarrollo profesional.





#### Dependecias 

- Java 17 (Amazon Corretto)
- Spring Boot 3.4.5
- Thymeleaf
- Maven
- Docker




#### Estructura del proyecto

```bash

websimple/
├── Dockerfile
├── pom.xml
├── src/
│   └── main/
│       ├── java/
│       │   └── mx/unam/aragon/ico/is/websimple/
│       │       ├── WebsimpleApplication.java
│       │       ├── modelo/Perro.java
│       │       └── controladores/ControladorPrincipal.java
│       └── resources/
│           └── templates/index.html

```


####  ¿Qué se realizó?

1. **Modelo Perro:**
   - **Descripción:** Se creó una clase con los atributos nombre y raza.

2. **Controlador Principal:**
   - **Descripción:** Se generó un endpoint / con Spring MVC que instancia un objeto Perro y lo envía al template HTML a través del modelo.

3. **Vista con Thymeleaf (index.html):**
   - **Descripción:** La plantilla muestra:

      - Un título de bienvenida.

      - El nombre.

      - Un mensaje dinámico como: “Hola, Fido!”
   
4. **Archivo Dockerfile:**
   - **Descripción:** contenido del Dockerfile.
     
      - Se utiliza Amazon Corretto 17 Alpine como base.

      - Se copia el .jar generado con Maven al contenedor.

      - Se expone el puerto 8080.

      - Se define el CMD para ejecutar la aplicación.

   

#### Comandos para ejecutar el contenedor Docker

```plaintext

# 1. Compilar la aplicación con Maven

./mvnw clean package

Hay que asegurarse de que el archivo .jar esté ubicado en target/websimple-0.0.1-SNAPSHOT.jar.


# 2. Construir la imagen Docker

sudo docker build -t websimple .


# 3. Ejecutar el contenedor

sudo docker run -p 8080:8080 websimple


```


---

## Requisitos

- JDK 8 o superior.
- IDE recomendado: IntelliJ IDEA, Eclipse o NetBeans.

## Instalación

1. Clona el repositorio en tu máquina local:
   ```bash
   git clone https://github.com/MarcusMario/ingSoftware.git
   ```
