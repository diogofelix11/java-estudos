# 1064 - Positivos e Média

## O que o exercício pede

Leia **seis valores**, conte quantos são positivos e calcule a média somente dos valores positivos.

Ao final, o programa deve mostrar:

1. a quantidade de valores positivos;
2. a média dos valores positivos com uma casa decimal.

## O que foi praticado

- `Scanner`
- `for`
- `if`
- Contador
- Acumulador
- Média aritmética
- Variáveis `int` e `double`
- `printf`

## Como resolvi

Utilizei duas variáveis:

- `positivo` para contar quantos valores são positivos;
- `soma` para acumular somente os valores positivos.

Dentro do `for`, verifico se o valor é maior que zero. Quando isso acontece, aumento o contador e adiciono o valor à soma.

Depois que os seis valores são lidos, calculo a média:

`media = soma / positivo`

Por fim, mostro a quantidade de positivos e utilizo `printf("%.1f")` para apresentar a média com uma casa decimal.

## Aprendizado

Este exercício foi um passo além do exercício 1060, porque além de contar os valores positivos foi necessário **acumular seus valores** para depois realizar outro cálculo.

Foi uma boa prática para entender a diferença entre um contador e um acumulador.

## Código

A solução está no arquivo `Main.java`.
