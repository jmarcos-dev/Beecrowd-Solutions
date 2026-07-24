package Java;

import java.util.Scanner;

public class RestoDaDivisao {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int valor1 = sc.nextInt();
        int valor2 = sc.nextInt();
        int aux;
        if(valor1 > valor2)
        {
            aux = valor2;
            valor2 = valor1;
            valor1 = aux;
        }
        for(int i = valor1+1; i < valor2; i++)
        {
            if(i%5==2 || i%5==3)
            {
                System.out.println(i);
            }
        }
        sc.close();
    }
}