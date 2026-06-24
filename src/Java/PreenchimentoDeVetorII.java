package Java;

import java.util.Scanner;

public class PreenchimentoDeVetorII {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int entrada = input.nextInt();

        for (int i = 0; i < 1000; i++) {
            System.out.println("N[" + i + "] = " + (i % entrada));
        }
        input.close();
    }

}
