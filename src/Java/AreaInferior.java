import java.util.Scanner;

public class AreaInferior {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        char op = input.next().charAt(0);

        double[][] matriz = new double[12][12];
        double soma = 0.0;
        int cont = 0;

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                matriz[i][j] = input.nextDouble();

                if (j > i && j > 11 - i) {
                    soma += matriz[i][j];
                    cont++;
                }
            }
        }

        if (op == 'S') {
            System.out.printf("%.1f%n", soma);
        } else {
            System.out.printf("%.1f%n", soma / cont);
        }

        input.close();
    }
}