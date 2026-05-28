import java.util.Scanner;

public class Corrida {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        int B = input.nextInt();
        int C = A % B;
        System.out.println(C);

        input.close();
    }
}
