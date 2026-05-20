package Java;

import java.util.Scanner;

public class SeisNumerosImpares {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int val = input.nextInt();

        for (int i = 0; i <= 6; i++) {
            if (val % 2 != 0) {
                System.out.println(val);
            }
            val++;
            
        }

    }
}
