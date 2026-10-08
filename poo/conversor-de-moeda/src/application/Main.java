package application;

import java.util.Scanner;
import java.util.Locale;

import util.ConversorDeMoeda;


public class Main {

    static void main(String[] args) {

        Locale.setDefault((Locale.US));
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual o valor do dólar: ");
        double dollar = sc.nextDouble();

        System.out.print("Quantos dólares você irá comprar? ");
        double compraDollar = sc.nextDouble();

        double valorFinal = ConversorDeMoeda.dolarFinal(dollar,compraDollar);

        System.out.printf("R$ %.2f%n", valorFinal);

        sc.close();

    }


}