# 1067 - Números Ímpares

## O que o exercício pede

Leia um número inteiro **X** e imprima todos os números ímpares entre **1 e X**, incluindo X quando ele for ímpar.

Cada número deve ser mostrado em uma linha.

## O que foi praticado

- `Scanner`
- `for`
- `if`
- Operador módulo (`%`)
- Verificação de números ímpares
- Limite de um laço de repetição

## Como resolvi

Primeiro, li o valor de X.

Depois, utilizei um `for` para percorrer os números de 1 até X. Para cada número, verifico se o resto da divisão por 2 é diferente de zero:

`i % 2 != 0`

Quando a condição é verdadeira, o número é ímpar e é impresso.

## Aprendizado

Este exercício ajudou a reforçar o uso do operador módulo para identificar números pares e ímpares e a controlar o limite de um `for`.

## Código

A solução está no arquivo `Main.java`.
