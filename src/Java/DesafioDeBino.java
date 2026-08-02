package Java;

import java.util.Scanner;


public class DesafioDeBino {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int vals = sc.nextInt();
        int valores;
        int multi2 = 0, multi3 = 0, multi4 = 0, multi5 = 0;
        for (int i = 0; i < vals; i++) {
            valores = sc.nextInt();

            if (valores % 2 == 0) {
                multi2++;
            }
            if (valores % 3 == 0) {
                multi3++;
            }
            if (valores % 4 == 0) {
                multi4++;
            }
            if (valores % 5 == 0) {
                multi5++;
            }
        }
        System.out.println(multi2 + " Multiplo(s) de 2");
        System.out.println(multi3 + " Multiplo(s) de 3");
        System.out.println(multi4 + " Multiplo(s) de 4");
        System.out.println(multi5 + " Multiplo(s) de 5");
        sc.close();
    }

}
