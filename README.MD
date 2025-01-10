# Sistema de Autenticación con JWT - Backend en Java (Spring Boot)

Este proyecto implementa un sistema de autenticación de usuarios utilizando **JSON Web Tokens (JWT)** en un backend desarrollado con **Java** y **Spring Boot**. Los usuarios pueden iniciar sesión proporcionando sus credenciales, y si son válidas, se les proporciona un token JWT que deben usar para acceder a rutas protegidas.

## Tecnologías Utilizadas

- **Java 17**
- **Spring Boot 3**
- **Maven**
- **Spring Security 6**
- **JWT (JSON Web Token)**
- **H2 Database**
- **Lombok**

## Estructura del Proyecto

La estructura del proyecto es la siguiente:

```bash
 BackendApplication.java
│
├───config
│       JwtAuthenticationFilter.java
│       SecurityConfig.java
│       TestData.java
│
├───controller
│       AuthController.java
│
├───dto
│       LoginRequest.java
│       LoginResponse.java
│
├───model
│       Role.java
│       User.java
│
├───repository
│       UserRepository.java
│
└───service
        AuthService.java
        CustomUserDetailsService.java
        JwtService.java
```

Usuario

```json
{
  "username": "test@test.com",
  "password": "test123"
}
```

POST /api/auth/login: Autenticación de usuario.

```
#Body(JSON)
http://localhost:8080/api/auth/login
```

```
#Respuesta(JSON)
"token": "eyJhbG...dñ",
```
