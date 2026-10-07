# 1040 - Média 3

## O que o exercício pede

Leia quatro notas de um aluno e calcule uma **média ponderada**, utilizando os pesos definidos pelo problema.

Depois, o programa deve informar se o aluno foi:

- aprovado;
- reprovado;
- encaminhado para exame.

Caso o aluno faça exame, uma nova nota deve ser lida, a média final deve ser calculada e o resultado deve ser informado.

## O que foi praticado

- `Scanner`
- Variáveis do tipo `double`
- Média ponderada
- Operações matemáticas
- Estrutura `if/else if/else`
- Leitura de uma nova entrada somente quando necessário
- Formatação de números com `printf`
- `Locale.US`

## Como resolvi

Primeiro, li as quatro notas e calculei a média ponderada utilizando os pesos do exercício:

`(nota1 * 2 + nota2 * 3 + nota3 * 4 + nota4) / 10`

Depois, utilizei uma estrutura `if/else if/else` para verificar a situação do aluno.

Quando a média fica na faixa de exame, o programa lê a nota do exame e calcula a média final:

`(media + notaExame) / 2`

Por fim, verifico novamente se a média final é suficiente para aprovação.

Também utilizei `printf` com `%.1f` para mostrar as médias com uma casa decimal, conforme exigido pelo exercício.

## Aprendizado

Este exercício ajudou a praticar estruturas condicionais mais completas e mostrou como um programa pode seguir caminhos diferentes dependendo dos valores informados.

Também pratiquei a formatação correta da saída, algo importante em exercícios do Beecrowd.

## Código

A solução está no arquivo `Main.java`.
