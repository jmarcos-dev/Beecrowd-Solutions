package Java;
import java.util.Scanner;

public class Cedulas {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int X = input.nextInt();
        int original = X;

        int nota100 = X / 100;
        X = X % 100;

        int nota50 = X / 50;
        X = X % 50;

        int nota20 = X / 20;
        X = X % 20;

        int nota10 = X / 10;
        X = X % 10;

        int nota5 = X / 5;
        X = X % 5;

        int nota2 = X / 2;
        X = X % 2;

        int nota1 = X;

        System.out.println(original);
        System.out.println(nota100 + " nota(s) de R$ 100,00");
        System.out.println(nota50 + " nota(s) de R$ 50,00");
        System.out.println(nota20 + " nota(s) de R$ 20,00");
        System.out.println(nota10 + " nota(s) de R$ 10,00");
        System.out.println(nota5 + " nota(s) de R$ 5,00");
        System.out.println(nota2 + " nota(s) de R$ 2,00");
        System.out.println(nota1 + " nota(s) de R$ 1,00");

        input.close();
    }
}