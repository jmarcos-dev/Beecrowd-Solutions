import java.util.Scanner;

public class DivisoresI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int valor = input.nextInt();
        for (int i = 1; i <= valor; i++) {
            if (valor%i==0) {
                System.out.println(i);
            }
        }
        input.close();
    }
}
