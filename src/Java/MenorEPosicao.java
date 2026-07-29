package Java;

import java.util.Scanner;

public class MenorEPosicao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        int aux = 0;
        int[] vector = new int[cases];
        int menor = 0, posicao = 0;

        vector[0] = sc.nextInt();
        menor = vector[0];
        posicao = 0;

        for (int i = 1; i < cases; i++) {
            vector[i] = sc.nextInt();

            if (vector[i] < menor) {
                menor = vector[i];
                posicao = i;
            }
        }
        System.out.println("Menor valor: " + menor);
        System.out.println("Posicao: " + posicao);
        sc.close();
    }
}
