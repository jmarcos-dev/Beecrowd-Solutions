import java.util.Scanner;

public class ValidacaoDeNota {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double soma = 0;
        int validas = 0;

        while (validas < 2) {
            double nota = input.nextDouble();

            if (nota >= 0 && nota <= 10) {
                soma += nota;
                validas++;
            } else {
                System.out.println("nota invalida");
            }
        }

        double media = soma / 2.0;
        System.out.printf("media = %.2f%n", media);
        input.close();
    }
}
