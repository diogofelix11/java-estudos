import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        int menor = Math.min(x, y);
        int maior = Math.max(x, y);
        int soma = 0;

        for (int i = menor + 1; i < maior; i++) {
            if (i % 2 != 0) {
                soma += i;
            }
        }

        System.out.println(soma);

        sc.close();
    }
}
