package Java;
import java.util.Scanner;
public class SalariocBonus {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String nome = input.nextLine();
        double salary = input.nextDouble();
        double vendas = input.nextDouble();
        double total = salary + (vendas*0.15);
        System.out.printf("TOTAL = R$ %.2f%n",total);
    }
}
