package Java;

import java.util.Scanner;

public class FormulaDeBhaskara {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double A = input.nextDouble();
        double B = input.nextDouble();
        double C = input.nextDouble();

        double delta = (B * B) - (4 * A * C);

        if (A == 0 || delta < 0) {
            System.out.println("Impossivel calcular");
        } else {
            double bhask1 = (-B + Math.sqrt(delta)) / (2 * A);
            double bhask2 = (-B - Math.sqrt(delta)) / (2 * A);

            System.out.printf("R1 = %.5f%n", bhask1);
            System.out.printf("R2 = %.5f%n", bhask2);
        }

        input.close();
    }
}