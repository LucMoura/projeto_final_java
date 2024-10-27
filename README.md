# Projeto Spring - Gerenciamento de Pessoas

Este projeto é uma aplicação web criada em Spring MVC para gerenciar dados de pessoas. A aplicação permite a criação, edição, listagem e exclusão de pessoas.

## Estrutura do Projeto

### 1. `PessoaController`

O controlador `PessoaController` é responsável por manipular as operações relacionadas a `Pessoa`, incluindo:
- Listar pessoas cadastradas
- Adicionar uma nova pessoa
- Editar uma pessoa existente
- Deletar uma pessoa

### 2. Endpoints

| Método HTTP | URL               | Descrição                                        |
|-------------|--------------------|--------------------------------------------------|
| GET         | `/pessoas`        | Exibe uma lista de todas as pessoas cadastradas. |
| GET         | `/pessoas/novo`   | Exibe o formulário para adicionar uma nova pessoa. |
| GET         | `/pessoas/editar/{id}` | Exibe o formulário para editar uma pessoa pelo `id`. |
| POST        | `/pessoas/salvar` | Salva uma nova pessoa ou atualiza uma existente. |
| GET         | `/pessoas/deletar/{id}` | Deleta uma pessoa específica pelo `id`. |

### 3. Classes e Métodos

- **pessoa()**: Lista todas as pessoas cadastradas.
- **novopessoa()**: Exibe o formulário de cadastro de uma nova pessoa.
- **editarPessoa()**: Exibe o formulário de edição com os dados de uma pessoa selecionada.
- **salvarpessoa()**: Salva uma nova pessoa ou atualiza uma existente.
- **deletarPessoa()**: Exclui uma pessoa pelo ID.

## Tecnologias Utilizadas

- **Java**
- **Spring Framework (Spring MVC)**
- **Thymeleaf**: Para renderizar as páginas HTML.
- **Maven**: Para gerenciamento de dependências.

## Como Executar o Projeto

1. Clone este repositório.
2. Configure o ambiente com JDK e Maven.
3. Execute o projeto usando `mvn spring-boot:run`.
4. Acesse `http://localhost:8080/pessoas` no navegador para acessar a aplicação.

## Estrutura de Pastas

```plaintext
src/
├── main/
│   ├── java/
│   │   └── com.spring.java_spring
│   │       ├── Controller/
│   │       │   └── PessoaController.java
│   │       ├── Model/
│   │       │   └── Pessoa.java
│   └── resources/
│       ├── templates/
│       │   ├── listar-pessoas.html
│       │   ├── form-pessoa.html
│       │   └── error-page.html
│       └── application.properties
