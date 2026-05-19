package Java;
import java.util.Scanner;

public class FatorialSimples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int val1 = input.nextInt();
        int i = val1, total=1;

        while (i!=0) {
            total*=i;
            i--;
        }
        System.out.println(total);
        input.close();
    }
}
