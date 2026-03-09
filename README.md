# Task List API - Spring Boot

Este projeto é uma **API REST simples de lista de tarefas** desenvolvida utilizando **Spring Boot**.
A aplicação permite criar, visualizar, atualizar e remover tarefas através de requisições HTTP.

O objetivo do projeto é praticar conceitos básicos de desenvolvimento backend com Java e APIs REST.

---

## Tecnologias usadas

* Java
* Spring Boot
* Jackson
* Maven

---

## Estrutura do projeto

```
src
 └─ main
     └─ java
         └─ tech.buildrun.task.list
             └─ controller
                 └─ ApiController.java
```

---

## Funcionalidades

A API possui operações básicas para manipular tarefas.

### Listar todas as tarefas

```
GET /tasks
```

Retorna todas as tarefas cadastradas.

Exemplo de resposta:

```json
["Primeira tarefa", "Segunda tarefa", "Terceira tarefa"]
```

---

### Criar uma nova tarefa

```
POST /tasks
```

Body da requisição:

```json
"Primeira tarefa"
```

Adiciona uma nova tarefa à lista.

---

### Atualizar uma tarefa

```
PUT /tasks/{id}
```

Atualiza uma tarefa existente usando o índice da lista como identificador.

Exemplo:

```
PUT /tasks/0
```

Body:

```json
"Modificando Primeira Tarefa"
```

---

### Remover todas as tarefas

```
DELETE /tasks
```

Remove todas as tarefas cadastradas na aplicação.

---

### Remover uma tarefa

```
DELETE /tasks/{id}
```

Remove uma tarefa existente usando o índice da lista como identificador

Exemplo:

```
DELETE /tasks/0
```

Apaga apenas a tarefa que estava no índice 0.

## Como executar o projeto

1. Clone o repositório

```
git clone https://github.com/nanic1/task-list
```

2. Entre na pasta do projeto

```
cd task-list
```

3. Execute o projeto

```
./mvnw spring-boot:run
```

ou execute pela sua IDE.

A aplicação iniciará em:

```
http://localhost:3000
```

---

## Testando a API

Você pode testar a API utilizando ferramentas como:

* Postman
* Insomnia
* curl

Lembre-se de colocar a URL **http://localhost:3000/tasks** para conseguir fazer as requições.
---

## 👨‍💻 Autor

Pedro Kurtz
