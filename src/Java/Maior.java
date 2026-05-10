package Java;
//Finalizar (não concluso)

import java.util.Scanner;

public class Maior {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int entrada1 = input.nextInt();
        int entrada2 = input.nextInt();
        int entrada3 = input.nextInt();

        int maiorABC = ((entrada1 + entrada2 + entrada3) + Math.abs(entrada1 - entrada2 - entrada3)) / 3;

        System.out.println(maiorABC + " eh o maior");

        input.close();
    }
}