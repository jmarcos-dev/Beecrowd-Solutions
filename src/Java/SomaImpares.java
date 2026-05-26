package Java;

import java.util.Scanner;

public class SomaImpares {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int valorUm = input.nextInt();
        int valorDois = input.nextInt();

        int inicio = Math.min(valorUm, valorDois);
        int fim = Math.max(valorUm, valorDois);

        int total = 0;

        for (int i = inicio + 1; i < fim; i++) {
            if (i % 2 != 0) {
                total += i;
            }
        }

        System.out.println(total);

        input.close();
    }
}