package Java;

import java.util.Scanner;

public class ConversaoDeTempo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int entrada = input.nextInt();

        int horas = entrada / 3600;
        int resto = entrada % 3600;
        int minutos = resto / 60;
        int segundos = entrada % 60;

        System.out.println(horas + ":" + minutos + ":" + segundos);
    }

}
