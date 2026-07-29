package Java;

import java.util.Scanner;

public class PepeJaTireiAVela {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            int H = sc.nextInt();
            int M = sc.nextInt();
            int O = sc.nextInt();

            System.out.printf("%02d:%02d - A porta %s!%n",
                    H, M, O == 1 ? "abriu" : "fechou");
        }

        sc.close();
    }
}
