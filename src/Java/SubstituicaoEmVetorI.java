package Java;

import java.util.Scanner;

public class SubstituicaoEmVetorI {
    public static void main() {
        Scanner input = new Scanner(System.in);
        int[] n = new int[10];
        int i = 0;
        for (i = 0; i < 10; i++) {
            n[i] = input.nextInt();

            if (n[i] <= 0) {
                n[i] = 1;
            }
        }
        for (int j = 0; j < 10; j++) {
            System.out.println("X[" + j + "] = " + n[j]);
        }

    }

}
