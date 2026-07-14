
import java.util.Scanner;

public class NumeroPerfeito {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        int valor = 0, aux = 0, perfeito = 0;
        for (int i = 1; i <= cases; i++) {
            valor = sc.nextInt();
            for (int j = 1; j < valor; j++) {
                if (valor % j == 0) {
                    aux += j;
                }
            }
            if (aux == valor) {
                System.out.println(valor + " eh perfeito");
            } else {
                System.out.println(valor + " nao eh perfeito");
            }
            aux = 0;
        }
        sc.close();
    }
}
