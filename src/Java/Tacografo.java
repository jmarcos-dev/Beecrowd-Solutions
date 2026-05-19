package Java;

import java.util.Scanner;

public interface Tacografo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int casos = input.nextInt();
        int tempo, velocidade, distancia = 0;

        while (casos != 0) {
            tempo = input.nextInt();
            velocidade = input.nextInt();
            distancia += velocidade * tempo;

            casos--;
        }
        System.out.println(distancia);
        input.close();

    }
}
