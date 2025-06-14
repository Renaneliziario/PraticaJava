# PraticaJava - DSList (Back-end)

## Objetivo

Estudo prático dos conceitos de Java, Spring Boot, JPA, modelagem relacional e API REST, conforme abordado no Intensivo Java DevSuperior.

Projeto desenvolvido para estudos práticos no Intensivo Java da [DevSuperior](https://devsuperior.com.br/).

Consiste apenas no back-end de uma API REST construída com Java e Spring Boot, para gerenciamento de listas e jogos, incluindo reordenação dos itens com persistência em banco PostgreSQL.

## Tecnologias e Técnicas Usadas

- **Java 21**
- **Spring Boot**: Criação de APIs RESTful.
- **Spring Data JPA (Hibernate)**: Mapeamento objeto-relacional.
- **PostgreSQL**: Banco de dados relacional.
- **Maven**: Gerenciamento de dependências.
- **Arquitetura em camadas**: Separação entre Controllers, Services, Repositories e Entidades.
- **Seed via `data.sql`**: População automática do banco em ambiente de desenvolvimento.
- **Transações (@Transactional)**: Garantia de integridade nas operações de reordenação.
- **Perfis de ambiente (`application-dev.properties`)**: Configuração facilitada para desenvolvimento.

---

## Como rodar

1. **Configure o PostgreSQL**  
   Crie um banco chamado `dslist` e ajuste usuário/senha em  
   `src/main/resources/application-dev.properties`:
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
   Ou pela sua IDE.

---

