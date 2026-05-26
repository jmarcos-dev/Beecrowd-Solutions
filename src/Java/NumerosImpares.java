package Java;

import java.util.Scanner;

public class NumerosImpares {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int valor = input.nextInt();
        for (int i = 0; i <= valor; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        input.close();
    }
}
