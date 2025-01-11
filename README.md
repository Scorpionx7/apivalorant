# Valorant API - Agentes e Mapas 🕵️

Bem-vindo(a) ao **Valorant API**, um projeto para gerenciar informações detalhadas sobre os agentes do jogo Valorant, incluindo suas habilidades, nacionalidades, mapas mais utilizados e muito mais! 
Este projeto foi criado para fornecer uma base sólida de dados e torná-lo acessível através de uma API moderna e bem estruturada. 🌟

---

## 🌌 **Visão Geral do Projeto**

O **Valorant API** é um sistema desenvolvido em **Java** com **Spring Boot** que:
- Gerencia informações dos agentes do Valorant, como habilidades, mapas mais utilizados, funções e nacionalidades.
- Permite a integração com um frontend visualmente bonito e dinâmico.
- Usa **MySQL** como banco de dados para armazenamento persistente.
- Está pronto para rodar em **Docker**, com suporte a deploy local e em containers.

---

## 🚀 **Funcionalidades**

1. **Agentes do Valorant**:
    - Lista de todos os agentes disponíveis.
    - Detalhes de cada agente, como habilidades e nacionalidade.

2. **Mapas**:
    - Lista de mapas com descrição.

3. **Backend Dinâmico**:
    - Endpoints RESTful para listar agentes, buscar detalhes e consultar mapas.
    - Estrutura extensível para adicionar mais funcionalidades no futuro.

---

## 🛠️ **Tecnologias Utilizadas**

- **Java 21**
- **Spring Boot**
- **MySQL**
- **Hibernate**
- **Docker** 
- **Postman** para testes de API

---

## 📦 **Configuração e Execução**

### Pré-requisitos
- **Java 21+**
- **Docker**
- **MySQL Workbench** (opcional para testes locais)

### Rodando Localmente
1. Clone o repositório:
   ```bash
   git clone https://github.com/Scorpionx7/apivalorant.git
   cd apivalorant
   ```

2. Configure o banco de dados no arquivo `application.properties`:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/valorant_api
   spring.datasource.username=root
   spring.datasource.password=sua-senha
   spring.jpa.hibernate.ddl-auto=update
   ```

3. Compile e execute o projeto:
   ```bash
   ./mvnw spring-boot:run
   ```

4. Acesse a aplicação em [http://localhost:8080](http://localhost:8080).

### Rodando com Docker
1. Suba os containers:
   ```bash
   docker-compose up --build
   ```

2. A aplicação estará disponível em [http://localhost:8080](http://localhost:8080).

## 📚 **Endpoints Principais**

### Agentes
- **Listar todos os agentes**: `GET /api/agentes`
- **Buscar agente por ID**: `GET /api/agentes/{id}`

### Mapas
- **Listar todos os mapas**: `GET /api/mapas`

---

## 🌟 **Futuras Melhorias**
- Adicionar suporte para skins dos agentes.
- Implementar autenticação e controle de acesso.
- Criar um frontend em Angular com integração completa.
- Adicionar gráficos dinâmicos mostrando a popularidade dos agentes em mapas.

---

## 🖼️ **Preview**

Imagine uma interface visual onde você pode:
- Ver uma lista com todos os agentes e suas imagens.
- Clicar em um agente e visualizar suas habilidades e os mapas em que ele é mais utilizado.
- Pesquisar agentes e filtrar por função (Duelista, Sentinela, etc.).

Fique ligado! Essa funcionalidade será implementada em breve! 🚀

---

## 📬 **Como me Contatar**

- **LinkedIn**: [Esther Rezende](https://www.linkedin.com/in/estherrezende/)
- **E-mail**: [rezendealvesesther@gmail.com](mailto:rezendealvesesther@gmail.com)

