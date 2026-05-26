package Java;

import java.util.Scanner;

public class QuadradodePares {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int valor = input.nextInt();
        int quadrado = 0;
        for (int i = 1; i <= valor; i++) {
            if (i % 2 == 0) {
                quadrado = i * i;
                System.out.println(i + "^2 = " + quadrado);

            }
        }

    }
}
