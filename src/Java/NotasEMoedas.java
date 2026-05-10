package Java;

import javax.xml.transform.Source;
import java.util.Scanner;

public class NotasEMoedas {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double X = input.nextDouble();
        int centavos = (int) (X * 100);

        int nota100 = centavos / 10000;
        centavos %= 10000;

        int nota50 = centavos / 5000;
        centavos %= 5000;

        int nota20 = centavos / 2000;
        centavos %= 2000;

        int nota10 = centavos / 1000;
        centavos %= 1000;

        int nota5 = centavos / 500;
        centavos %= 500;

        int nota2 = centavos / 200;
        centavos %= 200;
        System.out.println("NOTAS:");
        System.out.println(nota100 + " nota(s) de R$ 100.00");
        System.out.println(nota50 + " nota(s) de R$ 50.00");
        System.out.println(nota20 + " nota(s) de R$ 20.00");
        System.out.println(nota10 + " nota(s) de R$ 10.00");
        System.out.println(nota5 + " nota(s) de R$ 5.00");
        System.out.println(nota2 + " nota(s) de R$ 2.00");

        int moeda1 = centavos/100;
        centavos %= 100;
        int moeda50 = centavos/50;
        centavos %= 50;
        int moeda25 = centavos/25;
        centavos%=25;
        int moeda10 = centavos/10;
        centavos%=10;
        int moeda5 = centavos/5;
        centavos%=5;

        System.out.println("MOEDAS:");
        System.out.println(moeda1 + " moeda(s) de R$ 1.00");
        System.out.println(moeda50 + " moeda(s) de R$ 0.50");
        System.out.println(moeda25 + " moeda(s) de R$ 0.25");
        System.out.println(moeda10 + " moeda(s) de R$ 0.10");
        System.out.println(moeda5 + " moeda(s) de R$ 0.05");
        System.out.println(centavos+ " moeda(s) de R$ 0.01");

        input.close();
    }
}