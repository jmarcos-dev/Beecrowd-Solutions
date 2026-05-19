package Java;

import java.util.Scanner;

public class TopN {
    public static void main() {
        Scanner input = new Scanner(System.in);
        int valor = input.nextInt();
        if (valor == 1) {
            System.out.println("Top 1");
        } else if (valor >= 2 && valor <= 3) {
            System.out.println("Top 3");
        } else if (valor >= 4 && valor <= 5) {
            System.out.println("Top 5");
        } else if (valor <= 10) {
            System.out.println("Top 10");
        } else if (valor > 10 && valor <= 25) {
            System.out.println("Top 25");
        } else if (valor > 25 && valor <= 50) {
            System.out.println("Top 50");
        } else if (valor > 50) {

            System.out.println("Top 100");
        }
        input.close();

    }

}
