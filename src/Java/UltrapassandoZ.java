import java.util.Scanner;

public class UltrapassandoZ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int X = input.nextInt();
        int Z = input.nextInt();

        while (Z <= X) {
            Z = input.nextInt();
        }

        int soma = 0;
        int cont = 0;
        int numero = X;

        while (soma <= Z) {
            soma += numero;
            numero++;
            cont++;
        }

        System.out.println(cont);

        input.close();
    }
}