package Java;

import java.util.Scanner;

public class QuadradoeaoCubo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int entrada = input.nextInt();
        int duasVezes = 1;
        int tresVezes = 1;
        int i = 1;
        while (i != entrada + 1) {
            System.out.println(i + " " + duasVezes + " " + tresVezes);
            i++;
            duasVezes = i * i;
            tresVezes = duasVezes * i;
        }

    }
}
