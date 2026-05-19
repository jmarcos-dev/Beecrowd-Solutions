package Java;

import java.util.Scanner;

public class SequenciaSecreta {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int casos = input.nextInt();
        int aux = 1, entrada, conta, contaPonto = 1;

        while (casos != 0) {
            entrada = input.nextInt();
            conta = aux + entrada;
            if (conta == 1 || conta == 3) {
                contaPonto++;
            }
            aux = entrada;
            casos--;

        }
        System.out.println(contaPonto);
        input.close();
    }
}
