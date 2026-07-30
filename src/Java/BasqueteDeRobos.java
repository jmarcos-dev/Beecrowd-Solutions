package Java;

import java.util.Scanner;

public class BasqueteDeRobos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();
        int pontos;
        if (D <= 800) {
            pontos = 1;
        } else if (D > 800 && D <= 1400) {
            pontos = 2;
        } else {
            pontos = 3;
        }
        System.out.println(pontos);
        sc.close();
    }
}
