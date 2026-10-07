# 1035 - Teste de Seleção 1

## O que o exercício pede

Leia quatro valores inteiros **A, B, C e D** e verifique se eles atendem, ao mesmo tempo, a todas as condições definidas pelo problema.

O programa deve informar:

- `Valores aceitos`, quando todas as condições forem verdadeiras.
- `Valores nao aceitos`, quando pelo menos uma condição for falsa.

## O que foi praticado

- Declaração de variáveis do tipo `int`
- Leitura de dados com `Scanner`
- Operadores relacionais (`>`, `==`)
- Operadores lógicos
- Operador módulo (`%`)
- Estrutura condicional `if/else`
- Combinação de várias condições em uma única expressão

## Como resolvi

Primeiro, li os quatro valores usando `Scanner`.

Depois, coloquei todas as condições do exercício dentro do `if`, utilizando o operador `&&`. Dessa forma, o bloco só é executado quando **todas** as condições forem verdadeiras.

Também usei o operador módulo para verificar se o valor de **A** é par:

`a % 2 == 0`

Se todas as verificações forem atendidas, o programa mostra que os valores são aceitos. Caso contrário, mostra que não são aceitos.

## Aprendizado

Este exercício foi importante para praticar a combinação de várias condições em uma mesma estrutura `if`, entendendo que o operador `&&` exige que todas sejam verdadeiras.

## Código

A solução está no arquivo `Main.java`.
