package Java;

import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double raio = entrada.nextDouble();
        double n = 3.14159;
        double area = n * (raio*raio);

        System.out.printf("A=%.4f%n",area);
        entrada.close();
    }
}
