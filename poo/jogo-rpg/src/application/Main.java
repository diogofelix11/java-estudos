package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Personagem;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.print("Qual o nome do seu personagem? ");
        String nome = sc.nextLine();
        System.out.print("Quanto de ataque tem seu personagem? ");
        int ataque = sc.nextInt();
        System.out.print("Quanto de defesa tem seu personagem? ");
        int defesa = sc.nextInt();
        sc.nextLine();

        Personagem heroi = new Personagem(nome, ataque, defesa);

        System.out.print("Qual o nome do vilão? ");
        String nomeVilao = sc.nextLine();
        System.out.print("Quanto de ataque tem o vilão? ");
        int ataqueVilao = sc.nextInt();
        System.out.print("Quanto de defesa tem o vilão? ");
        int defesaVilao = sc.nextInt();
        System.out.println("Status do vilão: Nome - " + nomeVilao + " - Ataque - "
                + ataqueVilao + " - Defesa - " + defesaVilao);

        Personagem vilao = new Personagem (nomeVilao, ataqueVilao, defesaVilao);


        boolean jaSeCurou = false;

        while (heroi.estaVivo() && vilao.estaVivo()){

            heroi.atacar(vilao);
            if (vilao.estaVivo()){
                vilao.atacar(heroi);
            }

            if (heroi.estaVivo() && heroi.getVida() < 30 && !jaSeCurou){
                heroi.curar(20);
                System.out.println(heroi.getNome() + " se curou!");
                jaSeCurou = true;
            }

            heroi.exibirStatus();
            vilao.exibirStatus();
        }

        if (heroi.estaVivo()){
            System.out.println(heroi.getNome() + " venceu!");
        }
        else {
            System.out.println(vilao.getNome() + " venceu!");
        }

        System.out.println("Total de personagens: " + Personagem.getTotalPersonagens());

        sc.close();
    }
}