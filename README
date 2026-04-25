# 📌 Projeto: API de Gerenciamento de Tarefas

## 📖 Descrição

Este projeto consiste no desenvolvimento de uma API REST utilizando **Spring Boot** para gerenciamento de tarefas.
A aplicação permite realizar operações de **CRUD (Create, Read, Update e Delete)** com persistência em banco de dados **PostgreSQL**.

---

## 🛠️ Tecnologias Utilizadas

* Java 17
* Spring Boot
* Spring Data JPA
* PostgreSQL
* Lombok
* Thunder Client (para testes)

---

## 🧱 Arquitetura do Projeto

O projeto foi estruturado em camadas seguindo boas práticas:

```
com.felipe.tarefas
│
├── model.entity      → Entidade (Tarefa)
├── repository        → Acesso ao banco (JPA)
├── service           → Regras de negócio
└── apiresource       → Controlador REST
```

---

## 🗄️ Banco de Dados

### 🔹 Criação do banco

```sql
CREATE DATABASE tarefas_db;
```

---

### 🔹 Criação da tabela

```sql
CREATE TABLE tarefa (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(100),
    descricao TEXT,
    status VARCHAR(50),
    observacoes TEXT,
    data_criacao TIMESTAMP,
    data_atualizacao TIMESTAMP
);
```

---

## ⚙️ Configuração da Aplicação

Arquivo `application.properties`:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/tarefas_db
spring.datasource.username=postgres
spring.datasource.password=fp131921

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

## 🔁 Endpoints da API

### 📌 Criar tarefa

* **POST** `/tarefas`

```json
{
  "nome": "Estudar",
  "descricao": "Spring Boot",
  "status": "PENDENTE",
  "observacoes": "Projeto da faculdade"
}
```

---

### 📌 Listar tarefas

* **GET** `/tarefas`

---

### 📌 Atualizar tarefa

* **PUT** `/tarefas/{id}`

```json
{
  "nome": "Estudar MAIS",
  "descricao": "Spring Boot atualizado",
  "status": "CONCLUIDO",
  "observacoes": "Finalizado"
}
```

---

### 📌 Deletar tarefa

* **DELETE** `/tarefas/{id}`

---

## 🧪 Testes

Os testes foram realizados utilizando o **Thunder Client** no VS Code, permitindo validar todas as operações da API.

---

## 📊 Funcionalidades Implementadas

✔ Cadastro de tarefas
✔ Listagem de tarefas
✔ Atualização de tarefas
✔ Remoção de tarefas
✔ Controle de datas (criação e atualização)
✔ Integração com banco PostgreSQL

---

## 🚀 Como Executar o Projeto

1. Clonar o repositório
2. Criar o banco de dados no PostgreSQL
3. Configurar o `application.properties`
4. Executar a classe `TarefasApplication`
5. Testar os endpoints via Thunder Client ou navegador

---

## 👨‍💻 Autor

Felipe Avelino Pedaes

---
