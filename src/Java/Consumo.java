package Java;

import java.util.Scanner;

public class Consumo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int entrada1 = input.nextInt();
        double entrada2 = input.nextDouble();
        double total = entrada1 / entrada2;

        System.out.printf("%.3f km/l%n", total);

        input.close();

    }
}
