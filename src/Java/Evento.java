import java.util.Scanner;

public class Evento {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            int X = input.nextInt();
            int M = input.nextInt();
            
            if (X == 0 && M == 0) {
                break;
            }

            int total = X * M;
            System.out.println(total);
        }

        input.close();
    }

}
