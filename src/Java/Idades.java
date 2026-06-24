import java.util.Scanner;

public class Idades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int X = input.nextInt();
        int somador = 0;
        int contador = 0;

        while (X >= 0) {
            somador += X;
            contador++;
            X = input.nextInt();
        }

        double media = (double) somador / contador;

        System.out.printf("%.2f%n", media);

        input.close();
    }
}