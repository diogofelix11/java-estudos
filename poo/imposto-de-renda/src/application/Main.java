package application;

import java.util.Scanner;
import java.util.Locale;

import entities.Habitante;

public class Main {

    static void main(String[] args) {

        Locale.setDefault((Locale.US));
        Scanner sc = new Scanner(System.in);

        Habitante habitant = new Habitante();

        System.out.print("Digite seu salário: ");
        habitant.setSalario(sc.nextDouble());

        double imposto = habitant.impostoDeRenda();

        if (imposto == 0){
            System.out.println("Isento");
        }
        else {
            System.out.printf("Imposto a ser pago: R$ %.2f", imposto);
        }

        sc.close();


    }

}

