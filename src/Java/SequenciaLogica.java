import java.util.Scanner;

public class SequenciaLogica {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        for (int i = 1; i <= N; i++) {

            int quadrado = i * i;
            int cubo = i * i * i;

            System.out.println(i + " " + quadrado + " " + cubo);

            System.out.println(i + " " + (quadrado + 1) + " " + (cubo + 1));
        }

        input.close();
    }
}