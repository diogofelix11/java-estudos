# 1071 - Soma de Ímpares Consecutivos

## O que o exercício pede

Leia dois valores inteiros e calcule a soma de todos os números **ímpares que estão entre eles**, sem incluir os próprios valores informados.

A ordem dos dois valores de entrada pode variar.

## O que foi praticado

- `Scanner`
- `Math.min()` e `Math.max()`
- `for`
- `if`
- Operador módulo (`%`)
- Acumulador
- Intervalos

## Como resolvi

Primeiro, determinei qual dos dois valores é o menor e qual é o maior usando:

- `Math.min(x, y)`
- `Math.max(x, y)`

Depois, percorri somente os valores que estão **entre** eles, começando em `menor + 1` e terminando antes de `maior`.

Para cada número, verifico se ele é ímpar. Quando for, adiciono seu valor à variável `soma`:

`soma += i`

No final do laço, a variável `soma` contém o resultado pedido.

## Aprendizado

Este exercício ajudou a entender a diferença entre um intervalo que inclui os limites e um intervalo que não inclui os limites.

Também pratiquei o uso de um **acumulador** para somar vários valores encontrados durante um laço.

## Código

A solução está no arquivo `Main.java`.
