import java.util.Scanner;

public class TempoDeJogo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int tempo;
        if (a > b || a == b) {
            tempo = (24 - a) + b;
            System.out.println("O JOGO DUROU " + tempo + " HORA(S)");

        }
        if (a < b) {

            tempo = b - a;
            System.out.println("O JOGO DUROU " + tempo + " HORA(S)");
        }

        input.close();

    }
}
