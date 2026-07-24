package Java;

import java.util.Scanner;

public class Senha {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int valor = sc.nextInt();
            System.out.println(valor - 1);
        }

        sc.close();
    }
}
