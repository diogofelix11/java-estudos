# Jogo de RPG em Java

## Sobre o exercício

Neste exercício de fixação de Programação Orientada a Objetos, desenvolvi um pequeno jogo de RPG em Java, no qual um herói e um vilão lutam até que um dos dois fique sem vida.

O programa permite informar o nome, o ataque e a defesa de cada personagem. Durante a batalha, os personagens atacam alternadamente, podem acertar ataques críticos e o herói pode se curar uma vez durante o combate.

## Conceitos praticados

- **Classes e objetos:** criação dos personagens a partir da classe `Personagem`.
- **Encapsulamento:** utilização de atributos privados e métodos para consultar e modificar o estado dos personagens.
- **Construtores:** inicialização dos personagens com nome, ataque, defesa e vida inicial.
- **Métodos de instância:** implementação das ações de atacar, receber dano, curar e exibir status.
- **Membros estáticos (`static`):** contagem do total de personagens criados.
- **Estruturas condicionais e de repetição:** controle dos turnos e das condições de vitória.
- **Interação entre objetos:** um personagem recebe outro como alvo de um ataque.
- **Regras de negócio:** implementação de ataques críticos, limites de vida e condição de derrota.

## Como resolvi

Criei a classe `Personagem` para concentrar os atributos e comportamentos de cada personagem. No `Main`, recebo os dados informados pelo usuário, instancio o herói e o vilão e controlo o combate até que um deles seja derrotado.

Também implementei uma regra para dobrar o dano a cada terceiro ataque de cada personagem e uma cura que pode ser utilizada uma única vez pelo herói quando sua vida fica abaixo de 30 pontos.

## Tecnologias utilizadas

- Java
- Programação Orientada a Objetos (POO)
- IntelliJ
