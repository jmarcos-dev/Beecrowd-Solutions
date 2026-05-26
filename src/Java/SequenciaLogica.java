package Java;

import java.util.Scanner;

public class SequenciaLogica {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int entrada = input.nextInt();
        for (int i = 1; i <= entrada; i++) {
            for (int j = i; j < entrada; j++) {
                System.out.println(i + " " + j + " " + j*2);
            }
        }
    }
}
