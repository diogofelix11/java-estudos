# Exercício — Imposto de Renda

Exercício desenvolvido em Java durante meus estudos de Programação Orientada a Objetos (POO).

## Objetivo

O programa recebe o salário de um habitante e calcula o valor do imposto de renda de acordo com as faixas de tributação determinadas pelo exercício.

Este exercício também foi utilizado para praticar os primeiros conceitos de encapsulamento em Java.

## Conceitos praticados

- Criação de classes e objetos
- Atributos
- Métodos
- Modificador de acesso private
- Encapsulamento
- Métodos set
- Uso do this
- Estruturas condicionais (if, else if, else)
- Entrada de dados com Scanner
- Formatação de valores com printf

## Como funciona

O programa cria um objeto da classe Habitante e recebe o salário informado pelo usuário.

O atributo salario foi definido como private, portanto não é acessado diretamente pela classe Main.

Para alterar seu valor, foi criado o método setSalario():

public void setSalario(double salario) {
    this.salario = salario;
}

O cálculo do imposto é realizado pelo método impostoDeRenda() da classe Habitante.

## Exemplo

### Entrada

3002.00

### Saída

R$ 80.36

## Estrutura do projeto

imposto-de-renda/
├── README.md
└── src/
    ├── application/
    │   └── Main.java
    └── entities/
        └── Habitante.java

## Observação

Este exercício faz parte dos meus estudos iniciais de POO em Java. O objetivo neste momento é compreender os fundamentos de classes, objetos, métodos e encapsulamento antes de avançar para outros conceitos de orientação a objetos.