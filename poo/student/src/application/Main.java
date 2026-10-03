package application;

import java.util.Scanner;
import java.util.Locale;

import entities.Student;

public class Main {

    static void main(String[] args) {

        Locale.setDefault((Locale.US));
        Scanner sc = new Scanner(System.in);

        Student aluno = new Student();

        System.out.print("Nome: ");
        aluno.name = sc.nextLine();
        System.out.println("Notas: ");
        aluno.nota1 = sc.nextDouble();
        aluno.nota2 = sc.nextDouble();
        aluno.nota3 = sc.nextDouble();

        System.out.printf("Nota final: " + String.format("%.2f%n", aluno.notaFinal()));

        if (aluno.notaFinal() < 60) {
            System.out.println("Reprovado!");
            System.out.println("Faltaram: " + String.format("%.2f", aluno.notaNecessaria()) + " pontos");
        }
        else {
            System.out.println("Passou!");
        }


        sc.close();


    }

}

