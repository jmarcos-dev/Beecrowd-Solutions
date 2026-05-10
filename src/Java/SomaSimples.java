package Java;

import java.util.Scanner;

public class SomaSimples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int value1 = input.nextInt();
        int value2 = input.nextInt();
        int soma = value1 + value2;

        System.out.println("SOMA = "+soma);
    }

}