# Sistema de Gestión de Estudiantes

![Java](https://img.shields.io/badge/Java-17-blue)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.1.0-brightgreen)
![Thymeleaf](https://img.shields.io/badge/Thymeleaf-3.0.12-brightgreen)
![JPA](https://img.shields.io/badge/JPA-2.2-orange)
![MySQL](https://img.shields.io/badge/MySQL-8.0-yellowgreen)

## Descripción general

El **Sistema de Gestión de Estudiantes** es una aplicación web desarrollada utilizando **Spring Boot**, **JPA** y **Thymeleaf** para ayudar a las universidades a gestionar eficientemente a los estudiantes y cursos. Este sistema permite realizar operaciones CRUD, gestionar relaciones entre estudiantes y cursos, y realizar actualizaciones y eliminaciones masivas.

## Funcionalidades

- **Operaciones CRUD** para estudiantes y cursos.
- **Relación muchos a muchos** entre estudiantes y cursos.
- **Consultas JPQL**:
  - Obtener todos los estudiantes inscritos en un curso específico.
  - Obtener todos los cursos en los que está inscrito un estudiante particular.
- **Operaciones Masivas**:
  - Actualizar la edad de todos los estudiantes de un curso específico.
  - Eliminar estudiantes que no estén inscritos en ningún curso.
- **Interfaz de usuario** responsiva con Thymeleaf para la gestión de datos.

## Estructura del Proyecto
```bash
student-management-system/
│
├── src/
│   ├── main/
│   │   ├── java/com/universidad/
│   │   │   ├── controller/            # Controladores web
│   │   │   ├── model/                 # Modelos de entidades JPA
│   │   │   ├── repository/            # Repositorios (Spring Data JPA)
│   │   │   ├── service/               # Servicios para lógica de negocio
│   │   └── resources/
│   │       ├── templates/             # Plantillas HTML de Thymeleaf
│   │       └── application.properties # Configuración de la aplicación
│   └── test/                          # Tests unitarios e integrados
│
├── pom.xml                            # Configuración de Maven
└── README.md                          # Documentación del proyecto
```

## Requisitos previos

Antes de ejecutar la aplicación, asegúrate de tener instalado lo siguiente:

- **Java 17**
- **Maven 3.8+**
- **MySQL 8.0+** (o una base de datos alternativa como H2 para desarrollo local)

## Primeros pasos

### 1. Clonar el repositorio

```bash
git clone https://github.com/yourusername/student-management-system.git
cd student-management-system
```
## 2. Configurar la base de datos MySQL

En el archivo `src/main/resources/application.properties`, actualiza la configuración de la conexión a MySQL:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/university_db
spring.datasource.username=root
spring.datasource.password=tucontraseña
spring.jpa.hibernate.ddl-auto=update
```

## 3. Compilar el proyecto

Ejecuta el siguiente comando para compilar el proyecto:

```bash
mvn clean install
```

## 4. Compilar el proyecto

Utiliza el siguiente comando para iniciar la aplicación:

```bash
mvn spring-boot:run
```

La aplicación estará disponible en http://localhost:8080.

## Tecnologías utilizadas

- **Java 17**: Lenguaje de programación.
- **Spring Boot 3.1.0**: Framework para construir el backend.
- **Spring Data JPA**: ORM para interactuar con la base de datos.
- **Thymeleaf**: Motor de plantillas para el frontend.
- **MySQL**: Base de datos (o H2 para pruebas).
- **Maven**: Herramienta de automatización de construcción.

