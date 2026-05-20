package Java;

import java.util.Scanner;

public class AsAbasDePericles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        input.nextLine();
        while (b != 0) {
            String casos = input.nextLine();
            if (casos.equals("fechou")) {
                a--;
                a += 2;
            }
            if (casos.equals("clicou")) {
                a--;
            }
            b--;
        }
        System.out.println(a);
        input.close();
    }
}