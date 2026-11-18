# CRUD Spring

API REST em **Java 21 com Spring Boot 3** para usuários e pedidos, construída para praticar a arquitetura em camadas do Spring e o mapeamento objeto-relacional com JPA.

## O que tem aqui

- Camadas separadas: `resources` (controllers) → `services` → `repositories` → `entities`
- Entidades `User` e `Order` com relacionamento **um-para-muitos** (um usuário tem vários pedidos)
- Banco **H2 em memória** com perfil `test` e carga inicial de dados via `CommandLineRunner`
- Datas serializadas em ISO 8601 (UTC)

## Endpoints

| Método | Rota | Descrição |
|---|---|---|
| `GET` | `/users` | Lista os usuários |
| `GET` | `/users/{id}` | Busca um usuário |
| `GET` | `/orders` | Lista os pedidos |
| `GET` | `/orders/{id}` | Busca um pedido com seu cliente |

## Como rodar

```bash
./mvnw spring-boot:run
```

A API sobe em `http://localhost:8080` e o console do H2 fica em `http://localhost:8080/h2-console` (JDBC URL `jdbc:h2:mem:testdb`, usuário `sa`, sem senha).

## Tecnologias

Java 21 · Spring Boot 3.4 · Spring Web · Spring Data JPA · Hibernate · H2 · Maven
