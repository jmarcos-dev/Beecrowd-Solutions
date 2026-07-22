
import java.util.Scanner;

public class SequenciaDeNumerosESoma {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, M, aux, soma = 0;
        while (true) {
            N = sc.nextInt();
            M = sc.nextInt();
            if (N <= 0 || M <= 0) {
                break;
            }
            if (N > M) {
                aux = N;
                N = M;
                M = aux;
            }
            for (int i = N; i <= M; i++) {
                System.out.print(i + " ");
                soma += i;
            }
            System.out.println("Sum=" + soma);
            soma = 0;
        }
        sc.close();
    }
}
