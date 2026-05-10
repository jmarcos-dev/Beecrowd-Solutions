package Java;
//Finalizar (não concluso)

import java.util.Scanner;

public class Maior {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int entrada1 = input.nextInt();
        int entrada2 = input.nextInt();
        int entrada3 = input.nextInt();

        int maiorAB = (entrada1 + entrada2 + Math.abs(entrada1 - entrada2)) / 2;
        int maiorABC = (maiorAB + entrada3 + Math.abs(maiorAB - entrada3)) / 2;

        System.out.println(maiorABC + " eh o maior");

        input.close();
    }
}