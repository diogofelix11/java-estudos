# Employee

Exercício de Programação Orientada a Objetos em Java.

## Objetivo

Criar uma classe `Employee` capaz de armazenar o nome, salário bruto e imposto de um funcionário, calcular seu salário líquido e aumentar seu salário de acordo com uma porcentagem informada.

## Conceitos praticados

- Classes e objetos
- Atributos
- Métodos
- Entrada de dados com `Scanner`
- Organização em packages
- Método `toString()`
- Cálculos com porcentagem
- Formatação de números

## Funcionalidades

A classe `Employee` possui os seguintes atributos:

- `name` — nome do funcionário
- `grossSalary` — salário bruto
- `tax` — imposto

Também possui os seguintes métodos:

### `netSalary()`

Calcula o salário líquido do funcionário.

Fórmula:

`netSalary = grossSalary - tax`

### `increaseSalary(double percentage)`

Aumenta o salário bruto de acordo com a porcentagem informada.

Fórmula:

`aumento = grossSalary × percentage / 100`

### `toString()`

Retorna os dados atualizados do funcionário, mostrando seu nome e salário líquido.

## Exemplo

### Entrada

    Name: Alex Green
    Gross salary: 6000.00
    Tax: 1000.00

    Which percentage to increase salary? 10

### Saída

    Employee: Alex Green, $ 5000.00

    Updated data: Alex Green, $ 5600.00

## Estrutura do projeto

    employee/
    ├── README.md
    └── src/
        ├── application/
        │   └── Main.java
        └── entities/
            └── Employee.java

## O que aprendi

Neste exercício, pratiquei a criação de uma classe para representar um funcionário e a utilização de métodos para realizar operações relacionadas aos seus dados.

Também pratiquei cálculos com porcentagem, atualização de atributos e sobrescrita do método `toString()` para apresentar os dados do objeto de forma organizada.
