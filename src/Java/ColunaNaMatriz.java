package Java;

import java.util.Scanner;

public class ColunaNaMatriz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int coluna = sc.nextInt();
        sc.nextLine();
        String opcao = sc.nextLine();
        double cache = 0.0;
        double[][] matriz = new double[12][12];
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {

                matriz[i][j] = sc.nextDouble();
                if (j == coluna) {
                    cache += matriz[i][j];
                }
            }
        }
        if ("S".equals(opcao)) {
            System.out.printf("%.1f%n", cache);
        } else {
            System.out.printf("%.1f%n", cache / 12.0);
        }
        sc.close();
    }
}
