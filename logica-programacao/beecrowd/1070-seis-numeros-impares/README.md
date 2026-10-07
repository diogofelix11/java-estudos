# 1070 - Seis Números Ímpares

## O que o exercício pede

Leia um número inteiro e, a partir dele, imprima **seis números ímpares consecutivos**.

Se o número informado for par, a sequência deve começar pelo próximo número ímpar.

## O que foi praticado

- `Scanner`
- `if`
- Operador módulo (`%`)
- `for`
- Incremento
- Números ímpares consecutivos

## Como resolvi

Primeiro, verifico se o número informado é par:

`x % 2 == 0`

Se for par, somo 1 para transformá-lo no próximo número ímpar.

Depois, utilizo um `for` que executa exatamente seis vezes. Em cada repetição, imprimo o número atual e somo 2:

`x += 2`

Somando 2 a um número ímpar, continuo sempre na sequência de números ímpares.

## Aprendizado

Este exercício ajudou a entender que nem sempre precisamos testar novamente se cada número é ímpar. Depois de encontrar o primeiro ímpar, podemos avançar de 2 em 2 e garantir a sequência.

## Código

A solução está no arquivo `Main.java`.
