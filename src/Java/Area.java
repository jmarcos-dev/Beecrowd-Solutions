package Java;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double entrada1 = input.nextDouble();
        double entrada2 = input.nextDouble();
        double entrada3 = input.nextDouble();

        double pi = 3.14159;
        double trianguloRetangulo = (entrada1 * entrada3) / 2;
        double circulo = (entrada3 * entrada3) * pi;
        double trapezio = ((entrada1 + entrada2) * entrada3) / 2;
        double quadrado = entrada2 * entrada2;
        double retangulo = entrada1 * entrada2;

        System.out.printf("TRIANGULO: %.3f%n", trianguloRetangulo);
        System.out.printf("CIRCULO: %.3f%n", circulo);
        System.out.printf("TRAPEZIO: %.3f%n", trapezio);
        System.out.printf("QUADRADO: %.3f%n", quadrado);
        System.out.printf("RETANGULO: %.3f%n", retangulo);

        input.close();
    }

}
