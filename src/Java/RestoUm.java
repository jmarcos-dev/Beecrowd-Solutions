package Java;

import java.util.Scanner;

public class RestoUm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int Resto = A % B;
        System.out.println(Resto);
        sc.close();
    }
}
