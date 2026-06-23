# Workshop MongoDB - API REST com Spring Boot

## 📖 Sobre o Projeto

Este projeto consiste no desenvolvimento de uma API REST utilizando Java, Spring Boot e MongoDB, simulando uma rede social.

A aplicação permite gerenciar usuários, publicações e comentários, além de realizar consultas avançadas em postagens utilizando filtros por texto e período.

O objetivo principal foi praticar conceitos de desenvolvimento Back-End com Spring Boot e banco de dados NoSQL.

---

## 🚀 Tecnologias Utilizadas

- Java
- Spring Boot
- Spring Data MongoDB
- MongoDB
- Maven
- REST APIs
- DTO (Data Transfer Object)
- Tratamento de Exceções

---

## 🏗️ Arquitetura

O projeto foi desenvolvido utilizando arquitetura em camadas:

- Resource (Controllers)
- Service
- Repository
- Domain
- DTO

Essa estrutura facilita a manutenção, organização e escalabilidade da aplicação.

---

## 📋 Funcionalidades

### Usuários

- Listar usuários
- Buscar usuário por ID
- Cadastrar usuário
- Atualizar usuário
- Excluir usuário
- Consultar publicações de um usuário

### Postagens

- Buscar postagem por ID
- Buscar postagens por título
- Busca completa por:
  - Texto
  - Data inicial
  - Data final

### Comentários

- Adicionar comentários em postagens
- Armazenar autor e data do comentário

---

## 📊 Estrutura de Dados

### Usuário

```json
{
  "id": "123",
  "name": "Maria Brown",
  "email": "maria@gmail.com"
}
