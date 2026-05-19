package Java;

import java.util.Scanner;


public class PositivosEMedia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int positivos = 0;
        double soma = 0.0;

        for (int i = 0; i < 6; i++) {
            double valor = input.nextDouble();
            if (valor > 0) {
                positivos++;
                soma += valor;
            }
        }
        System.out.println(positivos + " valores positivos");
        System.out.printf("%.1f%n", soma / positivos);

        input.close();
    }


}
