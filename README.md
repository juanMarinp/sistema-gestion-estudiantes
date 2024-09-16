# sistema-gestion-estudiantes
Trabajo para la asignatura desarrollo web II IPChile

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

