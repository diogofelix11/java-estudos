package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com o número da conta: ");
        int numeroConta = sc.nextInt();
        System.out.print("Entre com o nome do titular da conta: ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.print("Será depositado um valor inicial? (s/n) ");
        char resposta = sc.next().charAt(0);

        Conta conta;

        if (resposta == 's') {
            System.out.println("Entre com o valor do depósito inicial: ");
            double depositoInicial = sc.nextDouble();

            conta = new Conta (numeroConta, name, depositoInicial);
        }
        else{
            conta = new Conta (numeroConta, name);
        }
        System.out.println(conta);

        System.out.print("Entre com o valor do depósito: ");
        double valorDeposito = sc.nextDouble();
        conta.deposito(valorDeposito);
        System.out.println("Dados da conta atualizados:");
        System.out.println(conta);

        System.out.print("Entre com o valor do saque: ");
        double valorSaque = sc.nextDouble();
        conta.saque(valorSaque);
        System.out.println("Dados da conta atualizados:");
        System.out.println(conta);


        sc.close();
    }
}