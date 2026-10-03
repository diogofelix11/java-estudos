# Student

Exercício de Programação Orientada a Objetos em Java.

## Objetivo

Criar uma classe `Student` capaz de armazenar o nome de um aluno e suas três notas, calcular a nota final e verificar se o aluno foi aprovado ou reprovado.

Caso o aluno seja reprovado, o programa também informa quantos pontos faltaram para atingir a média mínima.

## Conceitos praticados

- Classes e objetos
- Atributos
- Métodos
- Entrada de dados com `Scanner`
- Organização em packages
- Estruturas condicionais (`if` / `else`)
- Cálculos matemáticos
- Formatação de números

## Funcionamento

A classe `Student` possui os seguintes atributos:

- `name` — nome do aluno
- `nota1` — primeira nota
- `nota2` — segunda nota
- `nota3` — terceira nota

### `notaFinal()`

Calcula a nota final somando as três notas:

`notaFinal = nota1 + nota2 + nota3`

A nota máxima é **100 pontos** e a média mínima para aprovação é **60 pontos**.

### `notaNecessaria()`

Caso a nota final seja menor que 60 pontos, calcula quantos pontos faltaram para atingir a média mínima:

`pontos faltantes = 60 - notaFinal`

Caso o aluno já tenha atingido a média, o método retorna `0`.

## Regra de aprovação

O aluno é aprovado quando:

`notaFinal >= 60`

Caso contrário, o aluno é reprovado.

## Exemplo

### Aluno aprovado

Entrada:

    Nome: Alex Green
    Notas:
    27.00
    31.00
    32.00

Saída:

    Nota final: 90.00
    Passou!

### Aluno reprovado

Entrada:

    Nome: Alex Green
    Notas:
    17.00
    20.00
    15.00

Saída:

    Nota final: 52.00
    Reprovado!
    Faltaram: 8.00 pontos

## Estrutura do projeto

    student/
    ├── README.md
    └── src/
        ├── application/
        │   └── Main.java
        └── entities/
            └── Student.java

## O que aprendi

Neste exercício, pratiquei a criação de uma classe para representar um aluno e a utilização de métodos para calcular sua nota final e os pontos necessários para atingir a média.

Também pratiquei estruturas condicionais para determinar se o aluno foi aprovado ou reprovado e a utilização de métodos para separar responsabilidades dentro da classe.
