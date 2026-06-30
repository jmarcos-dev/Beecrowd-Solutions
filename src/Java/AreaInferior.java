package Java;

import java.util.Scanner;

public class AreaInferior {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char operacao = input.next().charAt(0);
        double[][] matriz = new double[12][12];

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                matriz[i][j] = input.nextDouble();
            }
        }
        double soma = 0;
        int inicio = 5;
        int fim = 6;

        for (int i = 7; i < 12; i++) {
            for (int j = inicio; j <= fim; j++) {
                soma += matriz[i][j];
            }
            inicio--;
            fim++;
        }
        if (operacao == 'M') {
            soma /= 30;

        }
        System.out.printf("%.1f%n", soma);

    }

}
