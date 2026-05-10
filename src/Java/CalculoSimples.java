package Java;

import java.util.Scanner;

public class CalculoSimples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int codigoPeca = input.nextInt();
        int quantiaPecaUm = input.nextInt();
        double valorPecaUm = input.nextDouble();

        int codigoPecaDois = input.nextInt();
        int quantiaPecaDois = input.nextInt();
        double valorPecaDois = input.nextDouble();

        double total = (quantiaPecaUm * valorPecaUm) + (quantiaPecaDois * valorPecaDois);

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);

    }
}
