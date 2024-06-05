# Banco Digital com Java e Orientação a Objetos

Este projeto é uma implementação de um banco digital utilizando os conceitos de Programação Orientada a Objetos (POO) em Java. O objetivo é reforçar o conhecimento em POO através da criação de uma aplicação prática que simula um banco com contas correntes, contas poupança, cartões de crédito e investimentos.

## Funcionalidades

- Criação de contas correntes e poupança
- Realização de depósitos, saques e transferências entre contas
- Emissão de extratos de conta
- Criação e gerenciamento de cartões de crédito
- Investimentos com cálculo de rendimentos
- Listagem de todos os clientes do banco

## Tecnologias Utilizadas

- Java 8+
- Lombok

## Pré-requisitos

- [Java JDK 8+](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- [Lombok](https://projectlombok.org/) (Certifique-se de que seu IDE está configurado para suportar Lombok)
- IDE de sua preferência (IntelliJ, Eclipse, etc.)

## Como Executar o Projeto

1. Clone o repositório:
   ```sh
   git clone https://github.com/mario-evangelista/dio-desafio-banco-digital.git
   ```

2. Importe o projeto em sua IDE.

3. Certifique-se de que o Lombok está configurado corretamente na sua IDE.

4. Execute a classe `Main` para ver a aplicação em ação.

## Estrutura do Projeto

- `Banco.java`: Classe que representa o banco, contendo uma lista de contas e métodos para listar clientes.
- `Cliente.java`: Classe que representa um cliente do banco.
- `Conta.java`: Classe abstrata que representa uma conta bancária.
  - `ContaCorrente.java`: Classe que representa uma conta corrente.
  - `ContaPoupanca.java`: Classe que representa uma conta poupança.
- `CartaoDeCredito.java`: Classe que representa um cartão de crédito.
- `Investimento.java`: Classe que representa um investimento.
- `IConta.java`: Interface que define os métodos de uma conta bancária.
- `Main.java`: Classe principal que contém o método `main` para execução da aplicação.

## Contribuição

1. Faça um fork do projeto.
2. Crie uma branch para sua feature (`git checkout -b feature/nova-feature`).
3. Commit suas mudanças (`git commit -m 'Adiciona nova feature'`).
4. Push para a branch (`git push origin feature/nova-feature`).
5. Abra um Pull Request.

## Licença

Este projeto está licenciado sob a licença MIT. Consulte o arquivo `LICENSE` para obter mais informações.

## Contato

Mário Evangelista - [mariojbe@gmail.com](mailto:mario@gmail.com)

Link do Projeto: [https://github.com/mario-evangelista/dio-desafio-banco-digital](https://github.com/mario-evangelista/dio-desafio-banco-digital)

**Meu Perfil na DIO:** [https://www.dio.me/users/mariojbe](https://www.dio.me/users/mariojbe)
