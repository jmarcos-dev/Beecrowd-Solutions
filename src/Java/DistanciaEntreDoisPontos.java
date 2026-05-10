package Java;

import java.util.Scanner;

public class DistanciaEntreDoisPontos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        double dx = x2 - x1;
        double dy = y2 - y1;

        double distancia = Math.sqrt(dx * dx + dy * dy);

        System.out.printf("%.4f%n", distancia);

        input.close();
    }
}