# 📝 Todolist — API com Spring Boot

Projeto de estudo de uma API para gerenciamento de tarefas,
desenvolvido com Java e Spring Boot.

O objetivo é praticar a construção de APIs REST, persistência
de dados e organização do código por responsabilidades.

## 🚧 Status

Em desenvolvimento. As funcionalidades e os testes estão
sendo implementados durante os estudos.

## 🛠️ Tecnologias

- Java
- Spring Boot 3.3.3
- Spring Web
- Spring Data JPA
- Hibernate
- H2 Database
- Lombok
- Maven
- Apidog para testes de requisições HTTP

## 📚 Conteúdos praticados

- Controllers e rotas HTTP
- Recebimento de dados em JSON
- Modelagem de usuários e tarefas
- Entidades e repositories com JPA
- Identificadores UUID
- Persistência em banco de dados
- Testes manuais da API com Apidog

## ▶️ Como executar

### Pré-requisitos

- JDK compatível com a versão configurada no `pom.xml`
- Git para clonar o repositório

O projeto inclui o Maven Wrapper.

### Passos

1. Clone este repositório usando a URL disponível no botão
   **Code** do GitHub.
2. Entre na pasta que contém o arquivo `pom.xml`.
3. Execute no PowerShell:

```powershell
.\mvnw.cmd clean spring-boot:run
```

No Linux ou macOS:

```bash
chmod +x mvnw
./mvnw clean spring-boot:run
```

Aguarde a mensagem `Started TodolistApplication` e confira
a porta indicada no log.

Com a configuração atual, o endereço base é:

```text
http://localhost:8080
```

## 🧪 Testando com Apidog

1. Inicie a aplicação e mantenha o terminal aberto.
2. Crie um projeto no Apidog.
3. Adicione uma requisição.
4. Configure o método HTTP e o caminho definidos no Controller.
5. Para endpoints que recebem JSON, configure o Body como JSON.
6. Envie a requisição e confira o status e o corpo da resposta.

As rotas disponíveis devem ser consultadas nos Controllers
do projeto.

## 🗄️ Banco de dados

A configuração atual utiliza H2 em memória:

```text
jdbc:h2:mem:todolist
```

O console está configurado em:

```text
http://localhost:8080/h2-console
```

Consulte `src/main/resources/application.properties` para
verificar as configurações de conexão.

Como o banco está em memória, os dados não são mantidos
após o encerramento da aplicação.

## 👩‍💻 Autora

**Sthefanny Lara Silva Alexandrino**

Estudante de Sistemas de Informação na UFPB.
Projeto desenvolvido para aprendizado de Java e Spring Boot.
