# Hábitos de Saúde

App em Spring Boot para registrar exercícios, refeições e sono.
Projeto do desafio #7DaysOfCode da Alura.

## Tecnologias

- Java 17
- Spring Boot 4.1.1 (Spring Web, Spring Data JPA, Actuator, DevTools)
- Thymeleaf
- H2 Database
- Lombok
- Maven

## Como rodar

```bash
./mvnw spring-boot:run
```

No Windows: `mvnw.cmd spring-boot:run`

## Endereços

- Página inicial: http://localhost:8080/
- Actuator (saúde): http://localhost:8080/actuator/health
- Console do H2: http://localhost:8080/h2-console
  - JDBC URL: `jdbc:h2:file:./data/habitosdb`
  - Usuário: `sa`
  - Senha: (vazia)

## Progresso do desafio

- [x] Dia 1: setup do projeto
- [ ] Dia 2: entidades
- [ ] Dia 3: repositórios
- [ ] Dia 4: API com controladores
- [ ] Dias 5 e 6: front-end com Thymeleaf
- [ ] Dia 7: relatórios com Chart.js

#7DaysOfCode
