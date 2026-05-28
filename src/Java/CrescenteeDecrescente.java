import java.util.Scanner;

public class CrescenteeDecrescente {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (input.hasNext()) {
            int X = input.nextInt();
            int Y = input.nextInt();

            if (X > Y) {
                System.out.println("Decrescente");
            }
            else if (X == Y) {
                break;
            } else {
                System.out.println("Crescente");
            }
        }
    }
}
