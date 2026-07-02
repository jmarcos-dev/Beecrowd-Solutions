import java.util.Scanner;

public class FibonacciEmVetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int casos = sc.nextInt();

        for (int i = 0; i < casos; i++) {
            int valor = sc.nextInt();

            if (valor == 0) {
                System.out.println("Fib(0) = 0");
                continue;
            }

            long penultimo = 0;
            long ultimo = 1;
            long atual = 1;

            for (int j = 2; j <= valor; j++) {
                atual = penultimo + ultimo;
                penultimo = ultimo;
                ultimo = atual;
            }

            System.out.println("Fib(" + valor + ") = " + ultimo);
        }

        sc.close();
    }
}