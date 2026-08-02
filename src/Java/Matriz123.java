package Java;

import java.util.Scanner;

public class Matriz123 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int sizeOne = sc.nextInt();

            if (sizeOne == 0) {
                break;
            }

            for (int i = 0; i < sizeOne; i++) {
                for (int j = 0; j < sizeOne; j++) {

                    if (i == j) {
                        System.out.print(1);
                    } else if (i + j == sizeOne - 1) {
                        System.out.print(2);
                    } else {
                        System.out.print(3);
                    }

                }
                System.out.println();
            }
        }

        sc.close();
    }
}