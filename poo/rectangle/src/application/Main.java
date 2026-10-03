package application;

import java.util.Scanner;
import java.util.Locale;

import entities.Rectangle;

public class Main {

    static void main(String[] args) {

        Locale.setDefault((Locale.US));
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rectangle width and height: ");

        Rectangle a = new Rectangle();

        a.width = sc.nextDouble();
        a.height = sc.nextDouble();

        System.out.print(a);


        sc.close();


    }

}

