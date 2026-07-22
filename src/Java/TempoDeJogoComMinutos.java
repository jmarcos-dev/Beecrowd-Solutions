
import java.util.Scanner;

public class TempoDeJogoComMinutos {

    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int hi = sc.nextInt();
        int mi = sc.nextInt();
        int hf = sc.nextInt();
        int mf = sc.nextInt();
        int horaInicial = (hi * 60) + mi;
        int horaFinal = (hf * 60) + mf;
        int duracaoMinutos = (horaFinal - horaInicial);
        int convert = duracaoMinutos / 60;
        int convertMin = duracaoMinutos % 60;

        if (horaInicial > horaFinal) {
            duracaoMinutos = ((horaFinal + 1440) - horaInicial);
            convert = duracaoMinutos / 60;
            convertMin = duracaoMinutos % 60;
            System.out.println("O JOGO DUROU " + convert + " HORA(S) E " + convertMin + " MINUTO(S)");

        } else if (duracaoMinutos == 0) {
            System.out.println("O JOGO DUROU " + 24 + " HORA(S) E " + 0 + " MINUTO(S)");
        } else {
            System.out.println("O JOGO DUROU " + convert + " HORA(S) E " + convertMin + " MINUTO(S)");

        }
    }
}
