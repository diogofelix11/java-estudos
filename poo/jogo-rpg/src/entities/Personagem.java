package entities;

public class Personagem {

    private String nome;
    private int vida;
    private int ataque;
    private int defesa;
    private static int totalPersonagens = 0;
    private int contadorAtaques;

    public Personagem(String nome, int ataque, int defesa) {
        this.nome = nome;
        this.ataque = ataque;
        this.defesa = defesa;
        this.vida = 100;
        totalPersonagens++;

    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public static int getTotalPersonagens() {
        return totalPersonagens;
    }

    public void receberDano(int dano) {
        vida -= dano;
        if (vida < 0) {
            vida = 0;
        }
    }

    public void atacar(Personagem alvo) {
        contadorAtaques++;
        int dano = Math.max(1, this.ataque - alvo.defesa);
        if (contadorAtaques % 3 == 0){
            dano *= 2;
            System.out.println(nome + " acertou um ataque crítico!");
        }
        alvo.receberDano(dano);
    }

    public boolean estaVivo() {
        return vida > 0;
    }

    public void curar(int quantidade) {
        vida += quantidade;
        if (vida > 100) {
            vida = 100;
        }
    }

    public void exibirStatus() {
        System.out.println(nome + " - Vida: " + vida);
    }


}
