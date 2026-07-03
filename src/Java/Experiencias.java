package Java;

import java.util.Scanner;

public class Experiencias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        int quantiaRato = 0, quantiaCoelho = 0, quantiaSapo = 0, quantiaTotal;
        double percecRato = 0.0, percecCoelho = 0.0, percecSapo = 0.0;

        for (int i = 0; i < casos; i++) {
            int quantia = sc.nextInt();
            String tipo = sc.next();

            if (("R").equals(tipo)) {
                quantiaRato += quantia;
            } else if (("C").equals(tipo)) {
                quantiaCoelho += quantia;
            } else if (("S").equals(tipo)) {
                quantiaSapo += quantia;
            }
        }
        quantiaTotal = quantiaRato + quantiaSapo + quantiaCoelho;
        percecRato = (quantiaRato * 100.0) / quantiaTotal;
        percecCoelho = (quantiaCoelho * 100.0) / quantiaTotal;
        percecSapo = (quantiaSapo * 100.0) / quantiaTotal;


        System.out.println("Total: " + quantiaTotal + " cobaias");

        System.out.println("Total de coelhos: " + quantiaCoelho);

        System.out.println("Total de ratos: " + quantiaRato);

        System.out.println("Total de sapos: " + quantiaSapo);

        System.out.printf("Percentual de coelhos: %.2f %%%n", percecCoelho);

        System.out.printf("Percentual de ratos: %.2f %%%n", percecRato);

        System.out.printf("Percentual de sapos: %.2f %%%n ", percecSapo);
    }

}
