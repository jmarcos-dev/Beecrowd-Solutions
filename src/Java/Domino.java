import java.util.Scanner;

public class Domino {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int quantiaPecas = ((N+1)*(N+2))/2;
        System.out.println(quantiaPecas);

        input.close();
    }
}
