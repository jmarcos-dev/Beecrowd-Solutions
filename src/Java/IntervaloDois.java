package Java;
import java.util.Scanner;

public class IntervaloDois {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int casos = input.nextInt();
        int entrada, intervalo = 0, out = 0;
        for (int i = 0; i < casos; i++) {
            entrada = input.nextInt();
            if (entrada >= 10 && entrada <= 20) {
                intervalo++;
            } if (entrada <10 || entrada> 20) {
                out++;
            }

        }
        System.out.println(intervalo + " in");
        System.out.println(out + " out");
        input.close();
    }
}
