
import java.util.Scanner;

public class AreaSuperior {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char operacao = sc.next().charAt(0);
        double[][] matriz = new double[12][12];
        double soma = 0.0;
        int cont = 0;

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                matriz[i][j] = sc.nextDouble();

                if (i < j && i + j < 11) {
                    soma += matriz[i][j];
                    cont++;

                }
            }

        }
        if (operacao == 'S') {
            System.out.printf("%.1f%n", soma);
        } else {
            System.out.printf("%.1f%n", soma / cont);
        }
        sc.close();
    }
}
