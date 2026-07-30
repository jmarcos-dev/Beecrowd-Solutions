package Java;

import java.util.Scanner;

public class Inseto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        int power;
        for (int i = 0; i < cases; i++) {
            power = sc.nextInt();
            if (power > 8000) {
                System.out.println("Mais de 8000!");
            } else {
                System.out.println("Inseto!");
            }
        }
        sc.close();
    }
}
