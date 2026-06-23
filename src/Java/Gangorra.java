import java.util.Scanner;

public class Gangorra {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        int B = input.nextInt();
        int C = input.nextInt();
        int D = input.nextInt();
        int esquerdo = A * B;
        int direito = C * D;
        if (esquerdo-direito == 0) {
            System.out.println("0");
        } else if (esquerdo > direito) {
            System.out.println("-1");
        } else if (direito > esquerdo) {
            System.out.println("1");
        }

        input.close();
    }
}
