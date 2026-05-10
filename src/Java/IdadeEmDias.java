package Java;

import java.util.Scanner;

public class IdadeEmDias {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int entrada = input.nextInt();
        int ano = entrada / 365;
        int resto = entrada%365;
        int mes = resto / 30;
        int dias = resto % 30;

        System.out.println(ano + " ano(s)");
        System.out.println(mes + " mes(es)");
        System.out.println(dias + " dia(s)");

        input.close();
    }

}
