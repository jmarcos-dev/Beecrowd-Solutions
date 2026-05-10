package Java;

import java.util.Scanner;

public class TesteDeSelecaoUm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int value1 = input.nextInt();
        int value2 = input.nextInt();
        int value3 = input.nextInt();
        int value4 = input.nextInt();

        if (value2 > value3 && value4 > value1 && value3 + value4 > value1 + value2 && value3 > 0 && value4 > 0 && value1 % 2 == 0) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }
        input.close();
    }

}
