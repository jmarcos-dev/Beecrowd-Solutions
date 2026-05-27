package Java;

import java.util.Scanner;

public class MacPronalts {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int casos = input.nextInt();
        int codigo, quantidade;
        double total=0.0;
        for (int i = 0; i < casos; i++) {
            codigo = input.nextInt();
            quantidade = input.nextInt();
            if (codigo == 1001) {
                total += 1.50 * quantidade;
            } else if (codigo == 1002) {
                total += 2.50 * quantidade;

            } else if (codigo == 1003) {
                total += 3.50 * quantidade;
            } else if (codigo == 1004) {
                total += 4.50 * quantidade;
            } else if (codigo == 1005) {
                total += 5.50 * quantidade;
            }

        }
        System.out.printf("%.2f%n",total);
        input.close();
    }


}
