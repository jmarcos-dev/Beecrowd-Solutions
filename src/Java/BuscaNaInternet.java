package Java;

import java.util.Scanner;

public class BuscaNaInternet {
    public static void main() {
        Scanner input = new Scanner(System.in);
        int pessoas = input.nextInt();
        System.out.println(pessoas*4);
        input.close();
    }


}
