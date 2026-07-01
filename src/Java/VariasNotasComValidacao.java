package Java;

import java.util.Scanner;

public class VariasNotasComValidacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nota1, nota2, media;
        int opcao = 1;

        while (opcao == 1) {

            do {
                nota1 = sc.nextDouble();
                if (nota1 < 0 || nota1 > 10) {
                    System.out.println("nota invalida");
                }
            } while (nota1 < 0 || nota1 > 10);

            do {
                nota2 = sc.nextDouble();
                if (nota2 < 0 || nota2 > 10) {
                    System.out.println("nota invalida");
                }
            } while (nota2 < 0 || nota2 > 10);

            media = (nota1 + nota2) / 2;
            System.out.printf("media = %.2f%n", media);

            do {
                System.out.println("novo calculo (1-sim 2-nao)");
                opcao = sc.nextInt();
            } while (opcao != 1 && opcao != 2);
        }
        sc.close();
    }
}
