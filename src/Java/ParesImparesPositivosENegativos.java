package Java;

import java.util.Scanner;

public class ParesImparesPositivosENegativos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 5;
        int par = 0, impar = 0, positivo = 0, negativo = 0, valores;

        while (i != 0) {
            valores = input.nextInt();
            if (valores % 2 == 0) {
                par++;
            } else 
            {
                impar++;
            }
            if (valores > 0) {
                positivo++;
            } else if (valores < 0) {
                negativo++;
            }
            i--;
        }
        System.out.println(par + " valor(es) par(es)");
        System.out.println(impar + " valor(es) impar(es)");
        System.out.println(positivo + " valor(es) positivo(s)");
        System.out.println(negativo + " valor(es) negativo(s)");

    }
}
