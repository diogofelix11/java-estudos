# Rectangle

Exercício de Programação Orientada a Objetos em Java.

## Objetivo

Criar uma classe `Rectangle` capaz de armazenar a largura e a altura de um retângulo e calcular sua área, perímetro e diagonal.

## Conceitos praticados

- Classes e objetos
- Atributos
- Métodos
- Entrada de dados com `Scanner`
- Organização em packages
- Método `toString()`
- Formatação de números
- Cálculos matemáticos

## Fórmulas

**Área:**

```text
area = width × height
```

**Perímetro:**

```text
perimeter = 2 × (width + height)
```

**Diagonal:**

```text
diagonal = √(width² + height²)
```

## Exemplo

### Entrada

```text
Enter rectangle width and height:
3.00 4.00
```

### Saída

```text
AREA = 12.00
PERIMETER = 14.00
DIAGONAL = 5.00
```

## Estrutura do projeto

```text
rectangle/
├── README.md
└── src/
    ├── application/
    │   └── Main.java
    └── entities/
        └── Rectangle.java
```

## O que aprendi

Neste exercício, pratiquei a criação de uma classe para representar uma entidade do problema (`Rectangle`), separando os dados e os comportamentos relacionados a ela.

Também pratiquei a criação de objetos a partir de uma classe e a utilização de métodos para realizar operações com os atributos do objeto.

Além disso, pratiquei a organização do código utilizando diferentes packages e a sobrescrita do método `toString()` para facilitar a apresentação dos resultados.

