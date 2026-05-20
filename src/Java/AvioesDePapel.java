package Java;

import java.util.Scanner;

public class AvioesDePapel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int competidores = input.nextInt();
        int quantiaFolhas = input.nextInt();
        int folhasPorCompetidor = input.nextInt();
        int total = quantiaFolhas/(competidores*folhasPorCompetidor);
        if (total ==0) {
            System.out.println("N");
        }
        else
        {
            System.out.println("S");
        }
        

    }
}
