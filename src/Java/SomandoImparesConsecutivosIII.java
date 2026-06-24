package Java;

import java.util.Scanner;

public class SomandoImparesConsecutivosIII {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int casos = input.nextInt();
        int X = 0, Y = 0, impares = 0;
        for (int i = 0; i < casos; i++) {
            X = input.nextInt();
            Y = input.nextInt();
            if (X % 2 == 0) {
                X++;
            }
            for (int j = 0; j < Y; j++) {
                impares += X;
                X += 2;
            }
            System.out.println(impares);
            impares = 0;
        }
        input.close();
    }
}
