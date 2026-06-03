import java.util.Scanner;

public class DividindoXPorY {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int casos = input.nextInt();
        int X = 0;
        int Y = 0;
        double div = 0.0;
        for (int i = 0; i < casos; i++) {
            X = input.nextInt();
            Y = input.nextInt();
            double Ydouble = Y;
            double Xdouble = X;
            if (Y == 0) {
                System.out.println("divisao impossivel");
            } else {
                div = Xdouble / Ydouble + 0.0;
                System.out.println(div);
            }
        }
        input.close();
    }
}
