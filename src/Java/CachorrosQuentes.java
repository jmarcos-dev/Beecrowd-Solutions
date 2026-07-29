package Java;
import java.util.Scanner;


public class CachorrosQuentes {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double H = sc.nextInt();
        double P = sc.nextInt();
        double media = H/P;
        System.out.printf("%.2f%n",media);
        sc.close();
    }
}
