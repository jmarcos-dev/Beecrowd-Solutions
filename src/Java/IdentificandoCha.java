package Java;

import java.util.Scanner;

public class IdentificandoCha {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int primeiro = input.nextInt();
        int primeiraResposta = input.nextInt();
        int segundaResposta = input.nextInt();
        int terceiraResposta = input.nextInt();
        int quartaResposta = input.nextInt();
        int quintaResposta = input.nextInt();
        int contador = 0;
        if (primeiraResposta == primeiro) {
            contador++;
        }  if (segundaResposta == primeiro) {
            contador++;
        }  if (terceiraResposta == primeiro) {
            contador++;
        }  if (quartaResposta == primeiro) {
            contador++;
        }  if (quintaResposta == primeiro) {
            contador++;
        }
        System.out.println(contador);
        input.close();
    }

}
