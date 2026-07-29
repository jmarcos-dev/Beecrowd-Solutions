
import java.util.Scanner;

public class SelecaoEmVetorI {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] vetor = new double[100];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = sc.nextDouble();

        }
        for (int i = 0; i < 100; i++) {
            if (vetor[i] <= 10) {
                System.out.println("A[" + i + "] = " + vetor[i]);
            }

        }

        sc.close();
    }
}
