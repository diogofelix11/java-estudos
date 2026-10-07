# 1048 - Aumento de Salário

## O que o exercício pede

Leia o salário de um funcionário e determine o percentual de reajuste de acordo com a faixa salarial.

Ao final, o programa deve mostrar:

- o novo salário;
- o valor do reajuste recebido;
- o percentual de reajuste aplicado.

## O que foi praticado

- `if/else if/else`
- Comparações entre valores
- Porcentagem
- Variáveis do tipo `double`
- Cálculos matemáticos
- `printf` e formatação decimal
- Organização da lógica em etapas

## Como resolvi

Primeiro, li o salário e criei uma variável chamada `reajuste`.

Depois, utilizei `if/else if/else` para descobrir em qual faixa salarial o funcionário estava. Para cada faixa, atribuí o percentual correspondente à variável `reajuste`.

Com o percentual definido, calculei o valor do reajuste:

`valorReajuste = salario * reajuste`

Depois, somei o reajuste ao salário original para encontrar o novo salário:

`novoSalario = salario + valorReajuste`

Por último, utilizei `printf` para mostrar os três resultados no formato solicitado.

## Aprendizado

Além de praticar condições, este exercício ajudou a entender como guardar um percentual em uma variável e utilizá-lo posteriormente nos cálculos.

Também pratiquei a diferença entre o **percentual** e o **valor efetivamente ganho** com o reajuste.

## Código

A solução está no arquivo `Main.java`.
