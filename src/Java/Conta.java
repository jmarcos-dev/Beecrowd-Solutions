
import java.util.Scanner;

public class Conta {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        int S = 0;
        for (int i = 0; i < cases; i++) {
            int val = sc.nextInt();
            for (int j = 1; j <= val; j++) {
                if (S == 1) {
                    S -= 1;
                } else {
                    S += 1;
                }

            }
            System.out.println(S);
            S = 0;

        }
        sc.close();
    }
}
