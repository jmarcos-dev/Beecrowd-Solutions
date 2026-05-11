package Java;

import java.util.Scanner;

public class MediaTres {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double N1 = input.nextDouble();
        double N2 = input.nextDouble();
        double N3 = input.nextDouble();
        double N4 = input.nextDouble();

        double media = ((N1 * 2) + (N2 * 3) + (N3 * 4) + (N4 * 1)) / 10;
        media = Math.floor(media * 10) / 10.0;

        System.out.printf("Media: %.1f%n", media);

        if (media >= 7.0) {
            System.out.println("Aluno aprovado.");
        } else if (media >= 5.0 && media <= 6.9) {
            System.out.println("Aluno em exame.");

            double nota_exame = input.nextDouble();
            System.out.printf("Nota do exame: %.1f%n", nota_exame);

            double resultado = (media + nota_exame) / 2.0;

            if (resultado >= 5.0) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }

            System.out.printf("Media final: %.1f%n", resultado);
        } else {
            System.out.println("Aluno reprovado.");
        }
    }
}