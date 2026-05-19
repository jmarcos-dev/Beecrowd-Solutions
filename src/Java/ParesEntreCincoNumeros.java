package Java;

import java.util.Scanner;

public class ParesEntreCincoNumeros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 5,par=0;
        int valores;
        while (i!=0) {
            valores = input.nextInt();

            if (valores%2==0) {
                par++;
            }

            i--;
        }
        System.out.println(par + " valores pares");
        input.close();
    }
}
