package Java;

import java.util.Scanner;

public class MatrizQuadradaI {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] valores;
        while (true) {
            int entrada = sc.nextInt();
            for (int i = 1; i <= entrada; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.println(i + " " + j);
                }
            }

            if (entrada == 0) {
                break;
            }
        }

    }

}
