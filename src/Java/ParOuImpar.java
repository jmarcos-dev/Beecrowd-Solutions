package Java;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        for (int i = 0; i < casos; i++) {
            int valor = sc.nextInt();
            if (valor == 0) {
                System.out.println("NULL");
            } else {
                String paridade = (valor % 2 == 0) ? "EVEN" : "ODD";
                String sinal = (valor > 0) ? "POSITIVE" : "NEGATIVE";
                System.out.println(paridade + " " + sinal);
            }

        }
        sc.close();
    }
}
