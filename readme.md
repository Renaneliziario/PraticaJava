# PraticaJava - DSList (Back-end)

Projeto desenvolvido para estudos durante o Intensivo Java da [DevSuperior](https://devsuperior.com.br/).  
Consiste em uma API REST em Spring Boot para catálogo e gerenciamento de listas de jogos, com persistência em PostgreSQL  
e integração opcional com front-end React (drag-and-drop e ordenação dinâmica).

---

## Tecnologias Utilizadas

- **Java 21**  
  Linguagem principal da aplicação.

- **Spring Boot**  
  Framework para desenvolvimento rápido de aplicações web e APIs RESTful.

- **Spring Data JPA (Hibernate)**  
  Abstração para persistência de dados com ORM, facilitando consultas e manipulação das entidades via repositórios.

- **PostgreSQL**  
  Banco de dados relacional utilizado para armazenar os jogos, listas e relações.

- **Maven**  
  Gerenciador de dependências e build do projeto Java.

- **Arquitetura em camadas**  
  Separação clara entre Controller (API/REST), Service (regras de negócio), Repository (acesso a dados) e Entidades.

- **Seed com `data.sql`**  
  Popular dados iniciais automaticamente no banco em ambiente de desenvolvimento.

- **Transações com `@Transactional`**  
  Garantia de atomicidade e integridade nas operações de reordenação dos itens das listas.

- **Projeções JPA (DTO/Projection)**  
  Utilização de interfaces para consultas otimizadas, buscando apenas dados necessários para exibir listas.

- **Perfis de ambiente (`application-dev.properties`)**  
  Permite fácil troca entre configurações de desenvolvimento e produção.

- **Integração RESTful com frontend**  
  Backend preparado para receber requisições do front-end React, incluindo atualização de ordenação via drag-and-drop.


## Como rodar

1. **Configure o PostgreSQL**  
   Crie um banco chamado `dslist` e ajuste usuário/senha em `src/main/resources/application-dev.properties`:
   ```properties
   spring.datasource.url=jdbc:postgresql://localhost:5432/dslist
   spring.datasource.username=postgres
   spring.datasource.password=1234567
   spring.jpa.hibernate.ddl-auto=update
   spring.sql.init.mode=always
   ```

2. **Popule o banco**  
   O arquivo `data.sql` já possui dados de exemplo.

3. **Rode o projeto**  
   Pelo terminal:
   ```sh
   ./mvnw spring-boot:run
   ```
   Ou pela sua IDE, rodando a classe principal.

## Objetivo

Praticar conceitos de Java, Spring Boot, JPA, API REST, modelagem relacional e integração full stack, conforme ensinado no Intensivo Java DevSuperior.

---