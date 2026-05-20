package Java;

import java.util.Scanner;

public class QuantaMandioca {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        int B = input.nextInt();
        int C = input.nextInt();
        int D = input.nextInt();
        int E = input.nextInt();
        int pira = 300 * A;
        int tata = 1500 * B;
        int boto = 600 * C;
        int pinguari = 1000 * D;
        int lara = 150 * E;
        int total = (pira + tata + boto + pinguari + lara) + 225;
        System.out.println(total);
    }
}
