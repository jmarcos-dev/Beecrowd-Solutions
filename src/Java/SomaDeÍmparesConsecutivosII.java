package Java;

import java.util.Scanner;


public class SomaDeÍmparesConsecutivosII {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int casos = input.nextInt();
        int valor1, valor2, aux, impar=0;
        for (int i = 0; i < casos; i++) {
            valor1 = input.nextInt();
            valor2 = input.nextInt();
            if (valor1 > valor2) {
                aux = valor2;
                valor2 = valor1;
                valor1 = aux;
            }
            for (int j = valor1+1; j < valor2; j++) {
                if (j%2!=0)
                {
                    impar+=j;
                }
            }
            System.out.println(impar);
            impar=0;
        }
    }
}
