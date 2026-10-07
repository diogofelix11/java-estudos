import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int tipo = sc.nextInt();
        int contador = 0;

        for (int i = 1; i <= 5; i++) {
            int resposta = sc.nextInt();

            if (resposta == tipo) {
                contador++;
            }
        }

        System.out.println(contador);

        sc.close();
    }
}
