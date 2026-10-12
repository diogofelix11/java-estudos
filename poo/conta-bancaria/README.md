# Conta Bancária

## Sobre o exercício

Exercício de fixação de Programação Orientada a Objetos em Java. O objetivo é simular a abertura de uma conta bancária e realizar operações de depósito e saque.

O programa permite informar um depósito inicial opcional e, em seguida, realiza um depósito e um saque, mostrando os dados atualizados da conta após cada operação.

## Conceitos praticados

* Classes e objetos.
* Encapsulamento com atributos privados.
* Construtores e sobrecarga de construtores.
* Getters e setter.
* Métodos de depósito e saque.
* Constantes com `static final`.
* Sobrescrita do método `toString()`.
* Entrada de dados com `Scanner`.

## Como resolvi

Criei a classe `Conta` para armazenar os dados da conta bancária e controlar as operações realizadas sobre ela.

Utilizei dois construtores, permitindo criar uma conta com ou sem depósito inicial. Também implementei os métodos de depósito e saque, considerando a taxa fixa de $ 5.00 por saque.

Na classe `Main`, organizei a entrada dos dados, a criação da conta e a execução das operações, exibindo os dados atualizados após cada uma delas.
