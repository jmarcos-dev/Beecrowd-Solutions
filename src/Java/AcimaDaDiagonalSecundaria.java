package Java;

import java.util.Scanner;

public class AcimaDaDiagonalSecundaria {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String operacao = sc.nextLine();
        double[][] matriz = new double[12][12];
        double cache = 0.0, contador = 0.0;
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                matriz[i][j] = sc.nextDouble();
                if (i + j < 11) {
                    cache += matriz[i][j];
                    contador++;
                }
            }
        }
        if ("S".equals(operacao)) {
            System.out.printf("%.1f%n", cache);
        } else {
            System.out.printf("%.1f%n", cache / contador);
        }
        sc.close();
    }
}
