package Java;

import java.util.Scanner;

public class NumerosPositivos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double A = input.nextDouble();
        double B = input.nextDouble();
        double C = input.nextDouble();
        double D = input.nextDouble();
        double E = input.nextDouble();
        double F = input.nextDouble();

        int contador = 0;

        if (A > 0) contador++;
        if (B > 0) contador++;
        if (C > 0) contador++;
        if (D > 0) contador++;
        if (E > 0) contador++;
        if (F > 0) contador++;

        System.out.println(contador + " valores positivos");

        input.close();
    }

}
