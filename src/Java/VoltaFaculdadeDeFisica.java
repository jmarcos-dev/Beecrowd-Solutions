package Java;

import java.util.Scanner;


public class VoltaFaculdadeDeFisica {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total;
        while (input.hasNextInt()) {
            int A = input.nextInt();
            int B = input.nextInt();
            total = (A * B) * 2;
            System.out.println(total);

        }

    }


}
