<div align="center">
  <img src="docs/shieldx_banner.png" alt="ShieldX API Banner" width="100%"/>

  <h1>ShieldX API</h1>
  <p>Advanced JWT Security & Authentication Service</p>

  <p>
    <a href="https://spring.io/projects/spring-boot"><img src="https://img.shields.io/badge/Spring_Boot-3.4.1-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white" alt="Spring Boot"></a>
    <a href="https://jwt.io"><img src="https://img.shields.io/badge/JWT-JSON%20Web%20Token-black?style=for-the-badge&logo=JSON%20web%20tokens" alt="JWT"></a>
    <a href="https://www.java.com/"><img src="https://img.shields.io/badge/Java-17-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java 17"></a>
  </p>
</div>

## 📌 Overview

**ShieldX** is a highly secure, enterprise-grade authentication and authorization API built with **Spring Boot 3** and **Spring Security**. It implements robust **JSON Web Token (JWT)** stateless authentication, demonstrating clean architecture, solid design principles, and modern security practices.

Developed as a showcase of backend engineering capabilities, ShieldX is designed to be a plug-and-play microservice for user identity management.

## 🚀 Key Features

- **Stateless Authentication:** Fully implemented JWT-based security filter chain.
- **Role-Based Access Control (RBAC):** Distinct `USER` and `ADMIN` roles.
- **Secure Password Storage:** Utilizing BCrypt hashing algorithm.
- **Clean Architecture:** Separation of concerns using Controller, Service, and Repository layers.
- **In-Memory Database:** H2 Database configured for instant setup and testing.
- **Lombok Integration:** Minimal boilerplate code.

## 📂 Architecture & Flow

1. **User Registration:** Endpoint to create a new user account. Passwords are encrypted before persisting to the DB.
2. **User Login:** Authenticates credentials and issues a signed JWT valid for 24 hours.
3. **Secure Resource Access:** The `JwtAuthenticationFilter` intercepts requests to protected endpoints, validates the token signature, and sets the Security Context.

## 🛠️ Tech Stack

- **Framework:** Spring Boot 3.4
- **Security:** Spring Security 6, JJWT (Java JWT)
- **Data Access:** Spring Data JPA, Hibernate
- **Database:** H2 Database Engine
- **Build Tool:** Gradle

## ⚙️ How to Run

1. Clone the repository
   ```bash
   git clone https://github.com/gabsprogrammer/shieldx.git
   ```
2. Navigate to the project directory
   ```bash
   cd shieldx
   ```
3. Run the application
   ```bash
   ./gradlew bootRun
   ```
4. The API will be available at `http://localhost:8080`

## 📡 API Endpoints

### Authentication
- `POST /api/v1/auth/register` - Register a new user
- `POST /api/v1/auth/authenticate` - Login and receive a JWT

### Protected Resources
- `GET /api/v1/secure` - Example endpoint requiring a valid Bearer Token in the `Authorization` header.

## 👨‍💻 Author

**Gabriel Santana**  
Fullstack Developer | [GitHub](https://github.com/gabsprogrammer) | [LinkedIn](https://linkedin.com)
