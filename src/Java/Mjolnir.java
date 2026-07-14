import java.util.Scanner;

public class Mjolnir {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            String nome = sc.next();
            int poder = sc.nextInt();

            if (nome.equals("Thor")) {
                System.out.println("Y");
            } else {
                System.out.println("N");
            }
        }

        sc.close();
    }
}