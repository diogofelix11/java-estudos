import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int positivo = 0;
        double soma = 0.0;

        for (int i = 1; i <= 6; i++) {
            double valor = sc.nextDouble();

            if (valor > 0) {
                positivo++;
                soma += valor;
            }
        }

        double media = soma / positivo;

        System.out.println(positivo);
        System.out.printf("%.1f%n", media);

        sc.close();
    }
}
