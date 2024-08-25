# Atividade Herança e Polimorfismo Solutis

Este projeto é uma aplicação em Java que demonstra o uso de herança e polimorfismo entre classes. Ele implementa uma hierarquia de classes para representar diferentes tipos de funcionários, sua escolaridade, e o cálculo de suas rendas. Além disso, a aplicação simula um zoológico e uma clínica veterinária para demonstrar o uso de classes abstratas e interfaces.

## Estrutura do Projeto

O projeto está organizado em pacotes da seguinte forma:

- `ex1a4`

  **`Animal.java`**: Classe abstrata que define os atributos e métodos comuns para todos os animais, incluindo o método abstrato `emitirSom()`.

  **`Cachorro.java`**: Classe derivada de `Animal` que implementa o método `emitirSom()` e possui o método adicional `correr()`.

  **`Cavalo.java`**: Classe derivada de `Animal` que implementa o método `emitirSom()` e possui o método adicional `correr()`.

  **`Preguica.java`**: Classe derivada de `Animal` que implementa o método `emitirSom()` e possui o método adicional `escalar()`.

  **`Veterinario.java`**: Classe que contém o método `examinar()` que recebe um `Animal` como parâmetro e chama o método `emitirSom()` do animal.

  **`Zoologico.java`**: Classe que contém um array de 10 jaulas para armazenar animais e possui métodos para adicionar animais e percorrer as jaulas, emitindo os sons e realizando ações específicas dos animais.

  **`Main.java`**: Classe principal que cria instâncias das classes `Cachorro`, `Cavalo`, `Preguica`, consulta animais no veterinário e simula um passeio pelas jaulas de um zoológico.

- `ex5a11`

  **`Empresa.java`**: Classe principal que cria e manipula instâncias das classes `Funcionario`, `FuncionarioEnsinoBasico`, `FuncionarioEnsinoMedio`, `FuncionarioGraduado`, e calcula as rendas e comissões.

  **`Funcionario.java`**: Classe base que contém atributos como nome, código funcional, escolaridade e comissão.

  **`FuncionarioEnsinoBasico.java`**: Classe derivada de `Funcionario`, representando um funcionário com ensino básico.

  **`FuncionarioEnsinoMedio.java`**: Classe derivada de `Funcionario`, representando um funcionário com ensino médio.

  **`FuncionarioGraduado.java`**: Classe derivada de `Funcionario`, representando um funcionário com graduação.

  **`Comissao.java`**: Interface que define o método para calcular o valor da comissão.

  **`Gerente.java`**: Classe que implementa a interface `Comissao`, fornecendo um adicional de R$1500,00 ao salário.

  **`Supervisor.java`**: Classe que implementa a interface `Comissao`, fornecendo um adicional de R$600,00 ao salário.

  **`Vendedor.java`**: Classe que implementa a interface `Comissao`, fornecendo um adicional de R$250,00 ao salário.
  
## Funcionalidades

- **Simulação de Zoológico**: O pacote `ex1a4` simula um zoológico com 10 jaulas que armazenam diferentes animais. A classe `Zoologico` percorre as jaulas, emite os sons dos animais e realiza ações específicas para cada tipo de animal.

- **Consulta Veterinária**: A classe `Veterinario` permite examinar diferentes tipos de animais, que emitem sons característicos durante a consulta.

- **Criação de Funcionários**: A classe `Funcionario` e suas subclasses permitem a criação de funcionários com diferentes níveis de escolaridade e atribuição de comissões.

- **Cálculo de Renda**: A renda dos funcionários é calculada com base em seu nível de escolaridade, com incrementos proporcionais ao nível alcançado, além de incluir os adicionais das comissões.

- **Simulação de Empresa**: A aplicação simula uma empresa com 10 funcionários distribuídos entre os diferentes níveis de escolaridade e cargos, e calcula os custos totais com salários e comissões.

## Como Executar

Para rodar o projeto, siga estas etapas:

1. **Clone o repositório:**

```bash
git clone https://github.com/AlmadaAlmada/atividade-heranca-e-polimorfismo-solutis.git
```

2. **Navegue até o diretório do projeto:**

```bash
cd atividade-heranca-e-polimorfismo-solutis
```
3. **Compile o projeto:**
   
Utilize um ambiente de desenvolvimento Java, como o IntelliJ IDEA ou Eclipse, para compilar o projeto.

## Estrutura do Arquivo
```
|-- src
|    |-- ex5a11
|    |   |-- Empresa.java                  <- Classe principal que executa o programa.
|    |
|    |   |-- classes base
|    |       |-- Funcionario.java          <- Classe base para todos os funcionários.
|    |       |-- FuncionarioEnsinoBasico.java <- Classe para funcionários com ensino básico.
|    |       |-- FuncionarioEnsinoMedio.java  <- Classe para funcionários com ensino médio.
|    |       |-- FuncionarioGraduado.java  <- Classe para funcionários com graduação.
|    |
|    |   |-- comissoes (interface)
|    |       |-- Comissao.java             <- Interface para cálculo de comissões.
|    |       |-- Gerente.java              <- Classe para gerente com comissão de R$1500,00.
|    |       |-- Supervisor.java           <- Classe para supervisor com comissão de R$600,00.
|    |       |-- Vendedor.java             <- Classe para vendedor com comissão de R$250,00.
|
|    |-- ex1a4
|        |-- Animal.java                   <- Classe abstrata que representa um animal.
|        |-- Cachorro.java                 <- Classe que representa um cachorro, herdando de Animal.
|        |-- Cavalo.java                   <- Classe que representa um cavalo, herdando de Animal.
|        |-- Preguica.java                 <- Classe que representa uma preguiça, herdando de Animal.
|        |-- Veterinario.java              <- Classe que simula uma consulta veterinária.
|        |-- Zoologico.java                <- Classe que simula um zoológico com 10 jaulas.
|        |-- Main.java                     <- Classe principal que executa o programa.
|
|-- README.md                              <- Arquivo de documentação do projeto.
```
## Licença

Projeto desenvolvido para fins educacionais.




