# 🛒 Ambiente de Vendas com JPA, PostgreSQL e MySQL

Este é um projeto de ambiente de vendas que utiliza **JPA (Java Persistence API)** para persistência de dados, com conexão simultânea aos bancos **PostgreSQL** e **MySQL**. A aplicação gerencia **produtos** e **clientes**, e utiliza **JUnit** para testes automatizados.

---

## 🚀 Tecnologias Utilizadas

- Java 17+
- JPA (Hibernate)
- PostgreSQL
- MySQL
- JUnit 5
- Maven ou Gradle
- Spring Boot *(se utilizado no projeto)*

---

## 🧱 Estrutura do Projeto

O projeto segue uma arquitetura em camadas:

- `model/` – Entidades JPA (Produto, Cliente)
- `repository/` – Interfaces de persistência
- `service/` – Lógica de negócio
- `controller/` – Acesso via API REST *(se aplicável)*
- `test/` – Testes automatizados com JUnit

---

## 🗃 Banco de Dados

Este projeto está configurado para conectar-se a dois bancos de dados simultaneamente:

- 🔵 **PostgreSQL** – Banco principal
- 🟠 **MySQL** – Banco secundário

As configurações dos múltiplos `DataSource` estão organizadas via propriedades:

```properties
# PostgreSQL
spring.datasource.postgres.url=jdbc:postgresql://localhost:5432/seu_banco
spring.datasource.postgres.username=usuario
spring.datasource.postgres.password=senha

# MySQL
spring.datasource.mysql.url=jdbc:mysql://localhost:3306/seu_banco
spring.datasource.mysql.username=usuario
spring.datasource.mysql.password=senha
