package Java;
import java.util.Scanner;
public class ProdutoSimples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int value1 = input.nextInt();
        int value2 = input.nextInt();
        int produto = value1*value2;

        System.out.println("PROD = "+ produto);
    }
}
