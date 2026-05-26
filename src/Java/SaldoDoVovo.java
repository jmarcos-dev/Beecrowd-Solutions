package Java;

import java.util.Scanner;

public class SaldoDoVovo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dias = input.nextInt();
        int saldoAtual = input.nextInt();
        int movimentacao = 0;
        int aux = saldoAtual;
        for(int i = 0; i < dias; i++)
        {
            movimentacao = input.nextInt();
            saldoAtual = saldoAtual + movimentacao;
            if (aux > saldoAtual) {
                aux = saldoAtual;
            }
        }
            System.out.println(aux); 
            input.close();
    }
}
