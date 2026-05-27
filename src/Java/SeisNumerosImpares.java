package Java;

import java.util.Scanner;

public class SeisNumerosImpares {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int valor = input.nextInt();
        if (valor % 2 == 0) {
            valor++;

        }
        for (int i = 0; i < 6; i++) {
            System.out.println(valor);
            valor += 2;
        }
        input.close();
    }
}
