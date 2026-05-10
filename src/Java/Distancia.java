package Java;

import java.util.Scanner;

public class Distancia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = 60;
        int y = 90;
        int entrada = input.nextInt();
        int calculo = entrada*2;

        System.out.println(calculo + " minutos");

        input.close();

    }
}
