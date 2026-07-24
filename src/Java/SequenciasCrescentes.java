package Java;

import java.util.Scanner;

public class SequenciasCrescentes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor = 0;
        while (true) {
            valor = sc.nextInt();
            if (valor == 0) {
                break;
            }
            for (int i = 1; i <= valor; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
