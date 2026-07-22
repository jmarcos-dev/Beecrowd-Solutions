
import java.io.IOException;
import java.util.Scanner;

public class SequencialLogicaDois {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int columns = sc.nextInt();
        int limite = sc.nextInt();

        int numero = 1;

        for (int i = 0; numero <= limite; i++) {
            for (int j = 0; j < columns && numero <= limite; j++) {
                System.out.print(numero);

                if (j < columns - 1 && numero < limite) {
                    System.out.print(" ");
                }

                numero++;
            }

            System.out.println();
        }

        sc.close();
    }
}
