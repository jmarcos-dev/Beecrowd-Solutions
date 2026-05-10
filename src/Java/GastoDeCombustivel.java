package Java;

import java.util.Scanner;

public class GastoDeCombustivel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int tempoViagem = input.nextInt();
        int velMedia = input.nextInt();
        double total = (tempoViagem * velMedia) / 12.0;

        System.out.printf("%.3f%n", total);

    }
}
