import java.util.Scanner;

public class Quadrante {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        while (true) {

        int A = input.nextInt();
        int B = input.nextInt();

            if (A == 0 || B == 0) {
                break;
            }

            if (A > 0 && B > 0) {
                System.out.println("primeiro");
            } else if (A < 0 && B > 0) {
                System.out.println("segundo");
            } else if (A < 0 && B < 0) {
                System.out.println("terceiro");
            } else {
                System.out.println("quarto");
            }
        }

        input.close();
    }

}
