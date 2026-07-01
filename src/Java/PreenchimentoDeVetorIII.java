package Java;

import java.util.Scanner;

public class PreenchimentoDeVetorIII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double input = sc.nextDouble();
        for (int i = 0; i < 100; i++) {
            System.out.print("N["+i+"] = ");
            System.out.printf("%.4f%n",input);
            input=input/2;
        }
        sc.close();
    }
}
