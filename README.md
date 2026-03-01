<div align="center">
  <img src="docs/shieldx_banner.png" alt="Banner da API ShieldX" width="100%"/>

  <h1>API ShieldX</h1>
  <p>Serviço Avançado de Autenticação e Segurança com JWT</p>

  <p>
    <a href="https://spring.io/projects/spring-boot"><img src="https://img.shields.io/badge/Spring_Boot-3.4.1-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white" alt="Spring Boot"></a>
    <a href="https://jwt.io"><img src="https://img.shields.io/badge/JWT-JSON%20Web%20Token-black?style=for-the-badge&logo=JSON%20web%20tokens" alt="JWT"></a>
    <a href="https://www.java.com/"><img src="https://img.shields.io/badge/Java-17-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java 17"></a>
  </p>
</div>

## 📌 Visão Geral

O **ShieldX** é uma API de autenticação e autorização de nível empresarial, construída com **Spring Boot 3** e **Spring Security**. Ele implementa autenticação *stateless* (sem estado) robusta usando **JSON Web Token (JWT)**, demonstrando arquitetura limpa, princípios sólidos de design e práticas modernas de segurança.

Desenvolvido como uma vitrine de habilidades em engenharia de backend, o ShieldX foi projetado para ser um microsserviço *plug-and-play* para gerenciamento de identidade de usuários.

## 🚀 Principais Funcionalidades

- **Autenticação Stateless:** Cadeia de filtros de segurança baseada em JWT totalmente implementada.
- **Controle de Acesso Baseado em Cargos (RBAC):** Funções distintas de `USER` (Usuário) e `ADMIN` (Administrador).
- **Armazenamento Seguro de Senhas:** Utilizando o algoritmo de hash BCrypt.
- **Arquitetura Limpa (Clean Architecture):** Separação clara de responsabilidades nas camadas Controller, Service e Repository.
- **Banco de Dados em Memória:** Banco de dados H2 configurado para uso e testes imediatos.
- **Integração com Lombok:** Código mais limpo e sem redundâncias (boilerplate).

## 📂 Arquitetura e Fluxo

1. **Registro de Usuário:** Endpoint para criar uma nova conta. As senhas são criptografadas antes de serem salvas no banco de dados.
2. **Login de Usuário:** Autentica as credenciais e emite um JWT assinado, válido por 24 horas.
3. **Acesso Seguro a Recursos:** O `JwtAuthenticationFilter` intercepta requisições para endpoints protegidos, valida a assinatura do token e configura o Contexto de Segurança.

## 🛠️ Tecnologias Utilizadas

- **Framework:** Spring Boot 3.4
- **Segurança:** Spring Security 6, JJWT (Java JWT)
- **Acesso a Dados:** Spring Data JPA, Hibernate
- **Banco de Dados:** H2 Database Engine
- **Ferramenta de Build:** Gradle

## ⚙️ Como Executar

1. Clone o repositório
   ```bash
   git clone https://github.com/gabsprogrammer/shieldx.git
   ```
2. Acesse a pasta do projeto
   ```bash
   cd shieldx
   ```
3. Rode a aplicação
   ```bash
   ./gradlew bootRun
   ```
4. A API estará disponível em `http://localhost:8080`

## 📡 Endpoints da API

### Autenticação
- `POST /api/v1/auth/register` - Registrar um novo usuário
- `POST /api/v1/auth/authenticate` - Fazer login e receber um JWT

### Recursos Protegidos
- `GET /api/v1/secure` - Endpoint de exemplo que exige um Bearer Token válido no cabeçalho `Authorization`.

## 👨‍💻 Autor

**Gabriel Santana**  
Desenvolvedor Fullstack | [GitHub](https://github.com/gabsprogrammer) | [LinkedIn](https://linkedin.com)
