import java.util.Scanner;

public class TiposDeTriangulos {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double A = input.nextDouble();
        double B = input.nextDouble();
        double C = input.nextDouble();

        double aux;

        // Ordenando em ordem decrescente
        if (A < B) {
            aux = A;
            A = B;
            B = aux;
        }

        if (A < C) {
            aux = A;
            A = C;
            C = aux;
        }

        if (B < C) {
            aux = B;
            B = C;
            C = aux;
        }

        // Verifica se forma triângulo
        if (A >= B + C) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {

            if (A * A == B * B + C * C) {
                System.out.println("TRIANGULO RETANGULO");
            }

            if (A * A > B * B + C * C) {
                System.out.println("TRIANGULO OBTUSANGULO");
            }

            if (A * A < B * B + C * C) {
                System.out.println("TRIANGULO ACUTANGULO");
            }

            if (A == B && B == C) {
                System.out.println("TRIANGULO EQUILATERO");
            } 
            else if (A == B || A == C || B == C) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }

        input.close();
    }
}